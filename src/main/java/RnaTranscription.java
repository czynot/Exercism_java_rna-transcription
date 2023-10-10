import java.util.stream.Collectors;

class RnaTranscription {
    String transcribe(String dnaStrand) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand = "";
        for(int i=0;i<dnaStrand.length();i++) {
            char word = dnaStrand.charAt(i);
            if (word == 'G')
                rnaStrand += 'C';
            if (word == 'C')
                rnaStrand += 'G';
            if (word == 'T')
                rnaStrand += 'A';
            if (word == 'A')
                rnaStrand += 'U';
        }
        return rnaStrand;
    }

}
