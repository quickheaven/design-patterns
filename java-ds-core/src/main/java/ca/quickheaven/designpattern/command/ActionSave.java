package ca.quickheaven.designpattern.command;

/**
 * This class will act as an Concrete Command.
 */
public class ActionSave implements ActionListenerCommand {

    private Document doc;

    public ActionSave(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
