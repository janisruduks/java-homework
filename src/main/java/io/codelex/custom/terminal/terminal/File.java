package io.codelex.custom.terminal.terminal;

public class File extends FileSystemObject {

    public File(String name) {
        super(name + ".txt");
    }

    public File(String name, String content) {
        super(name + ".txt", content);
    }

}
