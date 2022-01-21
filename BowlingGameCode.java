

    int score = 0;

    public int getBowlingScore(String allFrames) {
       // this.allFrames = allFrames;
        for (int i = 0; i <= allFrames.length()-1; i++) {
            if (allFrames.charAt(i) == 'X') {
                score = getScoreForStrike(allFrames, i);
            } else if (allFrames.charAt(i) == '-') {
                score = getScoreForZeroRoll(allFrames, i);
            } else if (Character.isDigit(allFrames.charAt(i))) {
                score = getScoreForDigit(allFrames, i);
            }
        }
        return score;
    }

    public int getScoreForStrike(String s, int i) {
        score = score + 10;
        if ((Character.isDigit(s.charAt(i + 2)) && Character.isDigit(s.charAt(i + 3)))) {
            int n1 = Character.getNumericValue(s.charAt(i + 2));
            int n2 = Character.getNumericValue(s.charAt(i + 3));
            score = score + n1 + n2;
        } else if (s.charAt(i + 3) == '/') {
            score = score + 10;
        } else if ((Character.isDigit(s.charAt(i + 2))) && s.charAt(i + 3) == '-') {
            int n3 = Character.getNumericValue(s.charAt(i + 2));
            score = score + n3;
        } else if (s.charAt(i + 2) == '-' && Character.isDigit(s.charAt(i + 3))) {
            int n4 = Character.getNumericValue(s.charAt(i + 3));
            score = score + n4;
        } else if (s.charAt(i + 2) == 'X') {
            score = getScoreForStrike(s, i);
        }
        i=i+1;
        return score;
    }


    public int getScoreForSpare(String s, int i) {
        score = score + 10;
        if (Character.isDigit(s.charAt(i + 2))) {
            int n = Character.getNumericValue(s.charAt(i + 2));
            score = score + n;
        } else if (s.charAt(i + 2) == '-') {
            score = score;
        } else if (s.charAt(i + 2) == 'X') {
            score = getScoreForStrike(s, i);
        }
        i=i+1;
        return score;
    }

    public int getScoreForDigit(String s, int i) {
        int n = Character.getNumericValue(s.charAt(i));
        score = score + n;
        if (Character.isDigit(s.charAt(i + 1))) {
            int n1 = Character.getNumericValue(s.charAt(i + 1));
            score = score + n1;
        } else if (s.charAt(i + 1) == '-') {
            score = score;
        } else if (s.charAt(i + 1) == '/') {
            score = getScoreForSpare(s, i);
        }
        i=i+1;
        return score;
    }

    public int getScoreForZeroRoll(String s, int i){
        if(s.charAt(i) == '-'){
            score = score;
        }
        else if(s.charAt(i+1) == '/'){
            score = getScoreForSpare(s,i);
        }
        else if(Character.isDigit(s.charAt(i+1))){
            score = getScoreForDigit(s,i);
        }
        i=i+1;
        return score;
    }