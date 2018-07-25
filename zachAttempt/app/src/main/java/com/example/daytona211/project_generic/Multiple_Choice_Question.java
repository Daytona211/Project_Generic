package com.example.daytona211.project_generic;

public class Multiple_Choice_Question {


        // Fields for the question
        private String prompt;
        private String correct_ans;
        private String ans_1;
        private String ans_2;
        private String ans_3;
        private String ans_4;

        // default constructor
        public Multiple_Choice_Question(String prompt, String correct_ans, String ans_1, String ans_2, String ans_3, String ans_4) {
            this.prompt = prompt;
            this.correct_ans = correct_ans;
            this.ans_1 = ans_1;
            this.ans_2 = ans_2;
            this.ans_3 = ans_3;
            this.ans_4 = ans_4;
        }

        // getters and setters for all fields
        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public String getCorrect_ans() {
            return correct_ans;
        }

        public void setCorrect_ans(String correct_ans) {
            this.correct_ans = correct_ans;
        }

        public String getAns_1() {
            return ans_1;
        }

        public void setAns_1(String ans_1) {
            this.ans_1 = ans_1;
        }

        public String getAns_2() {
            return ans_2;
        }

        public void setAns_2(String ans_2) {
            this.ans_2 = ans_2;
        }

        public String getAns_3() {
            return ans_3;
        }

        public void setAns_3(String ans_3) {
            this.ans_3 = ans_3;
        }

         public String getAns_4() {
            return ans_4;
        }

         public void setAns_4(String ans_4) {
            this.ans_4 = ans_4;
        }
}


}
