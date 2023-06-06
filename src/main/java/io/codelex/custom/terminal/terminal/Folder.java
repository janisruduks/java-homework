package io.codelex.custom.terminal.terminal;

import java.util.HashMap;
import java.util.Map;

public class Folder extends FileSystemObject {
    private Map<String, FileSystemObject> children;
    private Folder parent;

    public Folder(String name, Folder parent) {
        super(name);
        this.children = new HashMap<>();
        this.parent = parent;
    }

    public Folder(String name) {
        super(name);
        this.children = new HashMap<>();
    }

    public void add(FileSystemObject object) {
        this.children.put(object.getName(), object);
    }

    public FileSystemObject get(String name) {
        return this.children.get(name);
    }

    public Folder getParent() {
        return parent;
    }

    public boolean doesFileExist(String name) {
        return this.children.containsKey(name);
    }

    public void list() {
        for (String name : this.children.keySet()) {
            FileSystemObject object = this.children.get(name);
            if (object instanceof File) {
                System.out.println(name);
            } else if (object instanceof Folder) {
                System.out.println("/" + name);
            }
        }
    }

    public FileSystemObject delete(String name) {
        return this.children.remove(name);
    }
}
