package w3;
public class Exercise5 {
    public static void main(String[] args) {
        String proteinSequence = "GIVEQCCTSICSLYQLENYCNFVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTP\r\n" + //
                "KSICSLYQLVCGEVEQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCN\r\n" + //
                "FVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTPKSICSLYQLVCGEVEQCCTTSI\r\n" + //
                "CSLYLCGSQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCNFVNQHL";
        // { 0: 20 times base on amino acids character};
        int[] aminoAcidCount = new int[20];

        // Define the amino acids
        char[] aminoAcids = { 'A', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V',
                'W', 'Y' };

        // Iterate through the protein sequence
        for (char aminoAcid : proteinSequence.toCharArray()) {

            for (int i = 0; i < aminoAcids.length; i++) {
                if (aminoAcids[i] == aminoAcid) {
                    // aminoAcidCount[i]=aminoAcidCount[i]+1;
                    aminoAcidCount[i]++;
                }
            }
        }
        // Print the results
        for (int i = 0; i < aminoAcidCount.length; i++) {
            System.out.println("Amino Acid " + aminoAcids[i] + ": " + aminoAcidCount[i] + " occurrences");
        }
    }
}
