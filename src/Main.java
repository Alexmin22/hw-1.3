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
}
