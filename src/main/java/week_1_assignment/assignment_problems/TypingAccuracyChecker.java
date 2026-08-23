package main.java.week_1_assignment.assignment_problems;

public class TypingAccuracyChecker { 
    public static void main(String[] args) { 
      
        String original = "Programming";
        String typed = "Programming!";

        int matched = 0; 
        int minLength = Math.min(original.length(), typed.length()); 
        int total = original.length(); 
        int firstMismatch = -1; 
        char origChar = ' ', typedChar = ' ';  

        for (int i = 0; i < minLength; i++) { 
            if (original.charAt(i) == typed.charAt(i)) { 
                matched++; 
            } else if (firstMismatch == -1) { 
                firstMismatch = i + 1;  
                origChar = original.charAt(i); 
                typedChar = typed.charAt(i); 
            } 
        }   

    
if (firstMismatch == -1 && original.length() != typed.length()) {
    firstMismatch = minLength + 1;
    origChar = original.length() > minLength ? original.charAt(minLength) : '-';
    typedChar = typed.length() > minLength ? typed.charAt(minLength) : '-';
}

double accuracy = total > 0 ? ((double) matched / Math.max(original.length(), typed.length())) * 100 : 0.0; 

        if (firstMismatch != -1) { 
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')\n", 
                matched, total, accuracy, firstMismatch, origChar, typedChar); 
        } else { 
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches\n", 
                matched, total, accuracy); 
        } 
    } 
}


