package ca.quickheaven.designpattern.command;

/**
 * This class will act as an Concrete Command
 */
public class ActionOpen implements ActionListenerCommand {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
