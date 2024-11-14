package com.quest.practice_Vars;

public class StudentsScore {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };
        // Step 2: Calculate average scores
        calculateAverageScores(names, ages, scores);

        // Step 3: Find the highest scorer
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }

    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {

        for (int i = 0; i < names.length; i++) {
            int total = 0;
            int count = 0;

            for (int j = 0; j < scores[i].length; j++) {

                if (scores[i][j] != -1) {
                    total += scores[i][j];
                    count++;
                }
            }

            double average = 0;
            if (count > 0) {
                average = (double) total / count;
            }

            System.out.println(names[i] + " (Age: " + ages[i] + ") - Average Score: " + average);
        }
    }

    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        String highestScorer = "";
        int highestScorerAge = -1;
        double highestAverage = -1;

        for (int i = 0; i < names.length; i++) {
            int totalScore = 0;
            int validScoresCount = 0;

            for (int score : scores[i]) {
                if (score != -1) {
                    totalScore += score;
                    validScoresCount++;
                }
            }

            double averageScore = 0;
            if (validScoresCount > 0) {
                averageScore = (double) totalScore / validScoresCount;
            }


            if (averageScore > highestAverage) {
                highestAverage = averageScore;
                highestScorer = names[i];
                highestScorerAge = ages[i];
            }
        }

        System.out.println("Highest Scorer: " + highestScorer + " (Age: " + highestScorerAge +
                ") with an average score of " + highestAverage);
    }

    public static void rankStudents(String[] names, int[] ages, int[][] scores) {

            double[] averages = new double[names.length];

            // Calculate average for each student
            for (int i = 0; i < names.length; i++) {
                int totalScore = 0;
                int count = 0;

                for (int j = 0; j < scores[i].length; j++) {
                    if (scores[i][j] != -1) {
                        totalScore += scores[i][j];
                        count++;
                    }
                }

                // Calculate average score
                if (count > 0) {
                    averages[i] = (double) totalScore / count;
                } else {
                    averages[i] = 0;
                }

            }

            // Rank students based on average score
            for (int i = 0; i < averages.length; i++) {
                for (int j = i + 1; j < averages.length; j++) {
                    if (averages[i] < averages[j]) {
                        // Swap averages
                        double temp = averages[i];
                        averages[i] = averages[j];
                        averages[j] = temp;

                        // Swap names
                        String tempName = names[i];
                        names[i] = names[j];
                        names[j] = tempName;

                        // Swap ages
                        int tempAge = ages[i];
                        ages[i] = ages[j];
                        ages[j] = tempAge;
                    }
                }
            }
        System.out.println("Student Rankings by Average Score:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " (Age: " + ages[i] + ") - Average Score: " + averages[i]);
        }

        }
    public static void detectMissingData(String[] names, int[][] scores) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    System.out.println(names[i] +"has missing score for subject " + (j + 1));
                }
            }
        }
    }
    }




