package Core.Conversor;

import Core.Conversor.Functions.Filter;
import Core.Conversor.Functions.Processor;
import Core.Conversor.Functions.Tagger;
import Core.Conversor.Models.TaggedText;

import java.util.stream.Stream;

public class Conversor {

    private String code;
    private String pseudo;
    private String scannerVar;

    public Conversor(String code) {
        this.code = code;
    }

    public Conversor() {
        this.code = "";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPseudo() {
        if (pseudo == null) {
            convert();
        }
        return pseudo;
    }

    public String getScannerVar() {
        if (scannerVar == null) {
            searchScannerVar();
        }
        return scannerVar;
    }

    public void setScannerVar(String scannerVar) {
        this.scannerVar = scannerVar;
    }

    public void convert() {
        if (scannerVar == null) {
            searchScannerVar();
        }

        // Filtering processes
        String[] lines = Filter.filterText(code);

        // Tagging process
        Tagger tagger = new Tagger(scannerVar);
        TaggedText[] tagged = tagger.tagText(lines);

        // Tagged Text processor
        Processor processor = new Processor(scannerVar);
        String finalText = processor.processAll(tagged);

        pseudo = finalText;
    }

    public void searchScannerVar() {
        Stream.of(code.split("\n"))
                .filter(line -> line.contains("Scanner") && line.contains("new") && line.contains("System.in"))
                .findFirst()
                .ifPresent(scannerLine -> this.scannerVar = scannerLine.trim().split(" ")[1]);
    }

}
