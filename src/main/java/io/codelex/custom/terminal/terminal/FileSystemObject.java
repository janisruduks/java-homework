package io.codelex.custom.terminal.terminal;

abstract class FileSystemObject {
    protected String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
