package com.company;


    public class Father extends Grandpa{


        public Father(EyeColor color, String name, int age, Job job) {
            super(color, name, age, job);
        }

        public String skillToPlayBasketball(int height, int numOfThreePointShots){
            if(height > 180 && numOfThreePointShots > 7){
                return "You are pretty good at basketball";
            }else if(height <= 180 && numOfThreePointShots <= 6){
                return "You are okay at basketball";
            }return "";
        }

        public final String skillToPlayBasketball(){
            return "you are better than LeBron James";
        }
    }

