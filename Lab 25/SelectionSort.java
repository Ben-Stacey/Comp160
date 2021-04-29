/*
 * 
 * Ben Stacey, Lab 25, Selection Sort Algorithim
 * 
 */
public class SelectionSort{  
  
  /* selectionSort method runs processes the array */
  public static void selectionSort(int[] arr){  
    for (int i = 0; i < arr.length - 1; i++){  
      int index = i;  
      for (int j = i + 1; j < arr.length; j++){  
        if (arr[j] < arr[index]){  
          index = j;//searching for lowest index  
        }  
      }//end for loop  
      
      int smallerNumber = arr[index];   
      arr[index] = arr[i];  
      arr[i] = smallerNumber;  
    }//end for loop  
  }//end method  
  
  /* main method */
  public static void main(String args[]){  
    int[] arr1 = {9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435,9,14,3,2,43,11,58,22,76,45,1,3,6,7,90,44,3,4,7,7,9,443,636,336,67,98,10,57,43,99,53,75,35,65,21,53,79,35,7538,83838,83,898,202,93736,73482,82424,5921,5011,2254,9451,6132,9533,8838,4120,3983,916,8747,154,5,6389,3215,5795,7149,6755,9423,6881,9337,9956,7219,1917,2885,5319,1411,3806,4259,7463,8870,2987,2677,1172,629,73479,7106,1161,4223,3309,70,6663,3097,3237,469,9424,4024,2388,8726,465,3939,9427,3912,6100,8531,8655,1892,7244,8960,854,1265,6355,2742,8785,6891,187,3007,6081,9373,7459,5293,1137,9780,57,9159,5178,4018,3583,4230,9311,1289,1329,3138,2074,8185,3941,2333,4370,4654,2834,8866,486,2988,7188,3025,9164,3321,3516,3319978,2991,6178,9662,2554,7124,4564,9938,1902,4312,8762,5024,9393,1177,1478,2473,9222,8947,5605,6106,9931,3166,8371,1739,1446,4748,118,9165,2460,7208,7048,9898,7233,37605,83708442,1898,563,2061,417,2633,1212,6435}; 
    
    System.out.println("Unsorted Array:");  
    
    for(int member:arr1){  
      System.out.print(member + " ");  //array before sorting
    }//end for each loop  
    
    System.out.println();  
    
    selectionSort(arr1);//sorting array using selection sort  
    
    System.out.println();
    
    System.out.println("Sorted Array:");  
    for(int member:arr1){  
      System.out.print(member + " ");  //array after sorting
    }//end for each loop
  }//end method  
}//end class  