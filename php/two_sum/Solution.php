<?php
    class Solution {

        /**
         * @param Integer[] $nums
         * @param Integer $target
         * @return Integer[]
         */
        function twoSum($nums, $target) {
            for ($i = 0; $i < count($nums)-1; $i++) {
                for($j=$i;$j<count($nums)-1;$j++){
                    if($nums[$i]+$nums[$j+1]==$target){
                        return [$i,$j+1];
                    }
                }
            }
            
        }
    }


?>