// https://www.codecademy.com/courses/learn-java/projects/java-dna-sequencing

// Q3
/*
DNA Sequencing checks if a DNA is a protein or not!
Protein starts with ATG and ends with TGA
 */

// Q2
public class DNA {
    // instance me making this to constructor then methods
    String dna;

    // constructor
    public DNA(String dNa) {
        dna = dNa;
    }

    // method
    public void DNAMethod() {
        // Q6
        int length = dna.length();
        System.out.println("Length "+length);

        // Q7
        int start = dna.indexOf("ATG");
        System.out.println("Start: "+start);

        // Q8
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: "+stop);

        // Q9 - Q12 find the protein
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");

            String protein = dna.substring(start, stop+3);
            System.out.println("Protein: "+protein);
        } else {
            System.out.println("No protein");
        }
    }

    public String toString() {
        return dna;
    }

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        // Q4
        String dnaStrand1 = "ATGCGATACGCTTGA";
        String dnaStrand2 = "ATGCGATACGTGA";
        String dnaStrand3 = "ATTAATATGTACTGA";

        DNA dna1 = new DNA(dnaStrand1);
        DNA dna2 = new DNA(dnaStrand2);
        DNA dna3 = new DNA(dnaStrand3);



        dna1.DNAMethod();
        System.out.println();
        dna2.DNAMethod();
        System.out.println();
        dna3.DNAMethod();

/* Original question changed it around to make constructor and method

    // Q5
    String dna = dna3;

    // Q6
    int length = dna.length();
    System.out.println("Length "+length);

    // Q7
    int start = dna.indexOf("ATG");
    System.out.println("Start: "+start);

    // Q8
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: "+stop);

    // Q9 - Q12 find the protein
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      System.out.println("Condition 1 and 2 and 3 are satisfied.");

      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: "+protein);
    } else {
      System.out.println("No protein");
    }
*/
        // Q13


    }

}