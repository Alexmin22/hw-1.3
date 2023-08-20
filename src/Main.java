public class Main {
    public static void main(String[] args) {}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements
        //in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array sorted in non-decreasing order. The final sorted array should not be returned
        //by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote 
        //the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
        
        int len = m + n;
        int counter = 0;
        for(int i = m; i< len; i++) {
            nums1[i] = nums2[counter];
            counter++;
        }
            Arrays.sort(nums1);
    }

    public static boolean isPalindrome(int x) {
        //Given an integer x, return true if x is a palindrome, and false otherwise.
        
        String st = Integer.toString(x);
        int z = st.length()-1;

        for(int i = 0; i<st.length()/2; i++) {
            if(st.charAt(i) != st.charAt(z)) {
                return false;
            }
            z--;
        }
        return true;
    }

    public static boolean containsDuplicate(int[] nums) {
        //есть ли дубли в массиве чисел?
        Set<Integer> list = new HashSet<>();
        for(Integer in : nums) {
            if(list.contains(in)) {
                return true;
            }

            list.add(in);
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        //является ли s палиндромом?
        String lowerCase = s.toLowerCase();
        StringBuilder st = new StringBuilder(lowerCase.replaceAll("[^\\da-zA-Z]", ""));

        StringBuilder clone = new StringBuilder(st);

        clone.reverse();

        return st.toString().equals(clone.toString());
    }

    public static String longestCommonPrefix(String[] strs) {
        //Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
        
        Set<Character> setik = new HashSet<>();
        StringBuilder result = new StringBuilder();
        int counter = 0;

        while(true) {
            for (String st : strs) {

                if (st.length()-1 < counter) {
                    return result.toString();
                }

                setik.add(st.charAt(counter));

                if(setik.size() > 1) {
                    return result.toString();
                }
            }
            counter++;
                result.append(setik.iterator().next());
                setik.clear();
            }

        public int romanToInt(String s) {
            //конвертация римских цифр в арабские
        int res = 0;
        int prev = 0;
        int cur = 0;

        for(int i = s.length()-1; i > -1; i--) {
            cur = switch(s.charAt(i)) {
                case 'M' -> 1000;
                case 'D' -> 500;
                case 'C' -> 100;
                case 'L' -> 50;
                case 'X' -> 10;
                case 'V' -> 5;
                case 'I' -> 1;
                default -> -4;
            };

            if(prev>cur) {
                res -= cur;
            } else if (prev<=cur) {
                res += cur;
            }

            prev = cur;
        }
        return res;
    }

    public int removeElement(int[] nums, int val) {
        //удалить val из массива, вернуть кол-во элементов массива без вал, вместо вал поставить что угодно
        int count = 0;

        for(Integer in : nums) {
            if(in == val) {
                count++;
                in = 51;
            }
        }
        Arrays.sort(nums);
        return count;
    }

    public static int majorityElement(int[] nums) {
        //Given an array nums of size n, return the majority element. The majority element is the element that appears more 
        //than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
            
        if(nums.length == 1) {
            return nums[0];
        }
        double d =(double) nums.length/2;

        Map<Integer, Integer> mapa = new HashMap<>();

        for(Integer in : nums) {
            if(mapa.containsKey(in)) {
                int v = mapa.get(in)+1;
                mapa.put(in, v);
                if(v > d) {
                    return in;
                }
            } else {
            mapa.put(in, 1);
            }
        }
        return 9999;
    }

    public int minSubArrayLen(int target, int[] nums) {
        //Учитывая массив положительных целых чисел numsи положительное целое число target, вернуть минимальную
        //длину подмассив сумма которых больше или равна target. Если такого подмассива нет, верните 0 вместо него.
        int sum = 0;
        int begin = 0;
        int j = 0;
        int res = Integer.MAX_VALUE;

        while(j<nums.length) {
            sum += nums[j];
            while(sum >= target) {
                    res = j-begin+1 > res ? res : j-begin+1;
            sum -= nums[begin++];
        }
        j++;
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given 
        //an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can
            //be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
        for(int i =0; i<flowerbed.length; i++) {
                if(n==0) {
                    return true;
                }
                if(i == 0 && i+1 <flowerbed.length  && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] =1;
                    n--;
                } else if(i == flowerbed.length-1 && i-1 > 0 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                    flowerbed[i] =1;
                    n--;
                }
                if(flowerbed.length==1&&flowerbed[0]==0) {
          return true;
          }
                if(flowerbed[i] == 0 && i+2 <flowerbed.length && flowerbed[i+1] == 0 && flowerbed[i+2] == 0) {
                    flowerbed[i+1] =1;
                    n--;
                }
                if(n==0) {
                    return true;
                }
            }
            return false;
}

public int strStr(String haystack, String needle) {
    //Given two strings needle and haystack, return the index of the first occurrence
    //of needle in haystack, or -1 if needle is not part of haystack.
        int count = 0;
        int con = 0;
        if(needle.length() >= haystack.length()) {
            return needle.equals(haystack) ? 0 : -1;
        }
        
        for(int i = 0; i< haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(count)) {
                if(i + needle.length() > haystack.length()) {
                    return -1;
                }
                con = i;
                while (true) {
                    if(count > needle.length()-1 || haystack.charAt(i) != needle.charAt(count)) {
                        break;
                    } else if (count ==needle.length()-1) {
                        return con;
                    }
                    
                    count++;
                    i++;
                }
                count = 0;
                i = con;
            }
        }
        return -1;
    }

public void moveZeroes(int[] nums) {
    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.
        int zero = Integer.MAX_VALUE;
        int nonzero = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0 && zero == Integer.MAX_VALUE) {
                zero = i;
            } else if(nums[i] != 0) {
                if(zero < i) {
                    nonzero = nums[i];
                    nums[zero] = nonzero;
                    nums[i] = 0;
                    i = zero;
                    zero = Integer.MAX_VALUE;
                }
            }
        }
    }


    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //You must write an algorithm with O(log n) runtime complexity.
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

public int[] plusOne(int[] digits) {
    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
    //of the integer. The digits are ordered from most significant to least significant in left-to-right order. 
    //The large integer does not contain any leading 0's.
    //Increment the large integer by one and return the resulting array of digits.
        for(int i = digits.length-1; i>-1; i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length+1];
        digits[0] = 1;

        return digits;
}


public boolean isSubsequence(String s, String t) {
    //Given two strings s and t, return true if s is a subsequence of t, or false otherwise. A subsequence of a string is a new string 
    //that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions 
    //of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
        int count = 0;

        for(int i = 0; i<t.length(); i++) {
            if(count == s.length()) {
                return true;
            }
            if(s.charAt(count) == t.charAt(i)) {
                count++;
            }
        }
        if(count == s.length()) {
                return true;
            }
        return false;
    }

//Дан массив целых чисел nums, отсортированных в порядке возрастания, и целое число target, напишите функцию для поиска targetв nums.
//Если targetсуществует, верните его индекс. В противном случае возвращайтесь -1.Вы должны написать алгоритм со O(log n)сложностью выполнения.
    public int search(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]==target) {
                return i;
            }
        }
        return -1;
    }

//Учитывая неотрицательное целое число x, вернуть квадратный корень из xокругленного вниз до ближайшего целого числа .
//Возвращаемое целое число также должно быть неотрицательным .
    public int mySqrt(int x) {
        if(x == 1 || x==2)return 1;

        for(long i = 0; i<x; i++) {
            if(i*i > x) {
                return (int)--i;
            }
        }
        return 0;
    }

public int[] topKFrequent(int[] nums, int k) {
    //Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
        Map<Integer, Integer> mapa = new HashMap<>();

        for(int a : nums) {
            if(mapa.containsKey(a)) {
                mapa.replace(a, mapa.get(a)+1);
            } else {
                mapa.put(a, 1);
            }
        }
        
        int arr[] = new int[k];
       int j = 0;

        for(int i = 0; i<k; i++) {  
            int val = 0;
            int max = 0;    
            for(Map.Entry<Integer,Integer> ent : mapa.entrySet()) {
                if(ent.getValue() > val) {
                    val = ent.getValue();
                    max = ent.getKey();
                }
            }
            mapa.put(max, 0);
            arr[j] = max;
            j++;
    }
    return arr;
}

public int lengthOfLongestSubstring(String s) {
    //Given a string s, find the length of the longest substring without repeating characters.
        Set<Character> charSet = new HashSet<>();
        int size = 0;
        int max =0;
        int count = -1;

        if(s.length() == 1) {
            return 1;
        }

        for(int i = 0; i< s.length(); i++) {
            size = charSet.size();
            charSet.add(s.charAt(i));
            if(size == charSet.size()) {
                count++;
                max = charSet.size() > max ? charSet.size() : max;
                charSet.clear();
                i = count;
            }
        }
        max = Math.max(charSet.size(), max);
        return max;
    }


//Имеется целочисленный массив nums, отсортированный в порядке возрастания (с различными значениями). Перед тем, как быть переданным вашей функции, 
//numsон может быть повернут по неизвестному опорному индексу k( 1 <= k < nums.length), так что результирующий массив будет
//[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]( 0-индексирован ). Например, [0,1,2,4,5,6,7]может быть повернут по опорному индексу 3и станет [4,5,6,7,0,1,2].
//Учитывая массив nums после возможного поворота и целое число target, вернуть индекс, targetесли он находится в nums, или -1если он не находится вnums . Вы должны написать алгоритм со O(log n)сложностью выполнения.
public int search(int[] nums, int target) {
        int k = nums[0] > nums[nums.length-1] ? nums[0] : 0;
        int res = -1;

        if(target >= k) {
            for(int i = 0; i< nums.length; i++) {
                if(target == nums[i]) {
                    return i;
                } else if(nums[i] > target) {
                    return res;
                }
            }
        } else {
            for(int i = nums.length-1; i> 0; i--) {
                if(target == nums[i]) {
                    return i;
                } else if(nums[i] < target) {
                    return res;
                }
            }
        }
        return res;
}

//Получив 32-битное целое число со знаком x, верните xего цифры в обратном порядке.
//Если реверсирование xприводит к тому, что значение выходит за пределы диапазона 32-разрядных целых чисел со знаком , то возвращается значение 0.
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        sb.reverse();

        if (x<0) {
            sb.deleteCharAt(sb.length()-1);
        }

        long l = x >= 0 ? Long.parseLong(sb.toString()) : Long.parseLong(sb.toString()) - (Long.parseLong(sb.toString())*2);

        if (l > Integer.MAX_VALUE || l< Integer.MIN_VALUE) {
            return 0;
        }

        return (int) l;
    }

//Имеется целочисленный массив nums, отсортированный в неубывающем порядке (не обязательно с различными значениями). Перед тем, как быть переданным 
//вашей функции, numsон вращается по неизвестному опорному индексу k( 0 <= k < nums.length), так что результирующий массив [nums[k], nums[k+1], ..., 
//nums[n-1], nums[0], nums[1], ..., nums[k-1]]( 0-индексированный ). Например, [0,1,2,4,4,4,5,6,6,7]может быть повернут по опорному
//индексу 5и станет [4,5,6,6,7,0,1,2,4,4].Учитывая массив nums после поворота и целое число target, вернуть , trueесли targetон находится в nums
//или falseесли он не находится в nums.
public boolean search(int[] nums, int target) {
        if(target >= nums[0]) {
            for(int i = 0; i< nums.length; i++) {
                if(i > 0 && nums[i] < nums[i-1]) {
                    return false;
                } else if(target == nums[i]) {
                    return true;
                }
            }
        } else {
            for(int i = nums.length-1; i > -1; i--) {
                if(i < nums.length-1 && nums[i] > nums[i+1]) {
                    return false;
                } else if(target == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
//Учитывая целочисленный массив numsи целое число k, вернуть наибольший элемент в массиве .kth БЕЗ СОРТИРОВКИ!
//Обратите внимание, что это самый большой элемент в отсортированном порядке, а не отдельный элемент.kth kth
public int findKthLargest(int[] nums, int k) {
        Map<Integer, Integer> mapa = new HashMap<>();
            int max = Integer.MIN_VALUE;

            for(int i = 0; i< nums.length; i++) {
                if(mapa.containsKey(nums[i])) {
                    mapa.put(nums[i], mapa.get(nums[i])+1);
                } else {
                    mapa.put(nums[i], 1);
                }
            }

            while (k>0) {
                max = Integer.MIN_VALUE;
                for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
                    max = Math.max(max, entry.getKey());
                }
                k -= mapa.get(max);
                mapa.remove(max);
            }
            return max;
}
    
}





