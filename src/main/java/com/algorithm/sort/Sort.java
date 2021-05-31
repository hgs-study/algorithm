package com.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    //배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    //예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    // 1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    // 2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    // 3. 2에서 나온 배열의 3번째 숫자는 5입니다.
    public int[] K번째수(int[] array, int[][] commands){

        int[] answer = new int[commands.length];
        for(int i =0; i< commands.length ; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1 , commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }


}
