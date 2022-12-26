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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPseudo() {
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

        // Stream.of(tagged).forEach(line -> System.out.println(line.getText() + "                 | Tag: " + line.getTag() + " | Indentation: " + line.getIndentationLevel())); TODO: Line just for debugging

        // Tagged Text processor
        Processor processor = new Processor(scannerVar);
        String[] processedText;

    }

    public void searchScannerVar() {
        Stream.of(code.split("\n"))
                .filter(line -> line.contains("Scanner") && line.contains("new") && line.contains("System.in"))
                .findFirst()
                .ifPresent(scannerLine -> this.scannerVar = scannerLine.trim().split(" ")[1]);
    }

}
