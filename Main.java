
public class Main {
    public static void main(String[] args) {
     // The first and second max in arr
//        int [] arr = {1,3,435,23,542,452,54,54,5432,3542};
//        int max1 = arr[0], firstIndex = 0;
//        int max2 = arr[1], secondIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(max1 < arr[i]) {
//                max1 = arr[i];
//                firstIndex = i;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(max2 < arr[i] && max2 < max1 && arr[i] != max1) {
//                max2 = arr[i];
//                secondIndex = i;
//            }
//        }
//        System.out.println(max1 + " " + firstIndex);
//        System.out.println(max2 + " " + secondIndex);

        //The matrix
//        int[][] matrix = new int[10][10];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i > j && (i+j)<matrix.length-1) System.out.print( "   ");
//                else System.out.print(0 + "  ");
//            }
//            System.out.println();
//        }

        //217
//        int [] arr = {3,12,4,4,3,1,2};
//        int multiplication = 1;
//        for (int i = 1; i < arr.length; i+=2) {
//             multiplication = multiplication * arr[i] * arr[i];
//        }
//        System.out.println(multiplication);

        //219
//        int [] arr = {3,12,4,4,3,1,2};
//        int k = 2, count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(i % k == 0)count++;
//        }
//        System.out.println(count);

        //220
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int positive = 0, negative = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<0)negative++;
//            else if(arr[i]>0)positive++;
//        }
//        System.out.println(negative + " "  + positive);

        //221
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int a = 1, b = 5,sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>=a && arr[i]<=b)sum+=arr[i];
//        }
//        System.out.println(sum);

        //222
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int c = 1, d = 5, multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>=c && arr[i]<d)multiplication*=arr[i];
//        }
//        System.out.println(multiplication);

        //223
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int a = 1, b = 5,count = 0;
//        for (int i = 0; i <arr.length; i++) {
//            if(arr[i]>a && arr[i]<b)count++;
//        }
//        System.out.println(count);

        //228
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int k = 2, sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(i%k == 0) sum+=arr[i];
//        }
//        System.out.println(sum);

        //229
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//             if(arr[i] - i > 0)multiplication*=arr[i];
//        }
//        System.out.println(multiplication);

        //231,232
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int sum = 0,count = 0;
//        for (int i = 0; i < arr.length; i++) {
//               if(arr[i]%2==0){
//                   sum+=arr[i];
//                   count++;
//               }
//
//        }

        //233
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int sum = 0, multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2==0){
//                multiplication*=arr[i];
//                sum+=arr[i];
//            }
//        }

        //234
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int sum = 0,count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2!=0){
//                sum +=arr[i];
//                count++;
//            }
//        }
//        System.out.println((float)sum/count);

        //236
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int count = 0, multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%2!=0){
//                count++;
//                multiplication*=arr[i];
//            }
//        }

        //237
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0)count++;
//        }

        //238
//        int [] arr = {3,-12,4,-4,-3,-1,2};
//        int sum = 0, count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%3 == 0){
//                sum += arr[i];
//                count++;
//            }
//        }
//        System.out.println((float)sum/count);

        //240
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%7 == 0)count++;
//        }
//        System.out.println(count);

        //244
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]%5 == 2)multiplication*=arr[i];
//        }
//        System.out.println(multiplication);

        //245
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if((arr[i] + i) % 3 == 0) sum += arr[i] * arr[i];
//        }
//        System.out.println(sum);

        //248
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int sum = 0, k = 2;
//        for (int i = 0; i < arr.length; i++) {
//            if(((arr[i]+i)*(arr[i]+i)) % k == 0 ) sum += arr[i];
//        }

        //250
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int multiplication = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if((arr[i] * i ) % 3 == 2) multiplication *= arr[i] * arr[i];
//        }

        //251,252,253,254
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i])max = arr[i];
//            if(min > arr[i])min = arr[i];
//        }
//        int res = min + max;
//        int multiplication = min * max;
//        System.out.println(max + " + " + min + " = " + res);
//        System.out.println(max + " * " + min + " = " + multiplication);

        //255
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int max = arr[0], index = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//                index = i;
//            }
//        }
//        System.out.println(max + index);

        //256
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int min = arr[0], index = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(min > arr[i]){
//                min = arr[i];
//                index = i;
//            }
//        }
//        System.out.println(min + index);

        //257
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int max1 = arr[0], firstIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(max1 < arr[i]){
//                max1 = arr[i];
//                firstIndex = i;
//
//            }
//        }
//        System.out.println(firstIndex);

        //258
//        int [] arr = {3,49,4,-4,49,-3,49,49};
//        int max1 = arr[0], firstIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(max1 <= arr[i]) {
//                max1 = arr[i];
//                firstIndex = i;
//            }
//        }
//       System.out.println(max1 + " " + firstIndex);

        //259
//        int [] arr = {3,-12,4,-4,49,-3,-1,2};
//        int min = arr[0], firstIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(min > arr[i]){
//                min = arr[i];
//                firstIndex = i;
//
//            }
//        }
//        System.out.println(min + " " + firstIndex);

        //260
//        int [] arr = {3,49,4,-4,49,-4,49,-4};
//        int min = arr[0], firstIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(min >= arr[i]) {
//                min = arr[i];
//                firstIndex = i;
//            }
//        }
//       System.out.println(min + " " + firstIndex);





























    }
}