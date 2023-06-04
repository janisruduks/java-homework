package io.codelex.custom.terminal.terminal;


public class Terminal {
    private Folder currentFolder;

    public Terminal(Folder rootFolder) {
        this.currentFolder = rootFolder;
    }

    public String getPath() {
        return this.currentFolder.getName();
    }

    public void cd(String name) {
        FileSystemObject target = currentFolder.get(name);
        if (target instanceof Folder) {
            currentFolder = (Folder) target;
        } else {
            System.out.println("Invalid directory");
        }
    }

    public void touch(String name) {
        File file = new File(name);
        currentFolder.add(file);
    }

    public void mkdir(String name) {
        Folder folder = new Folder(name);
        currentFolder.add(folder);
    }

    public void ls() {
        this.currentFolder.list();
    }

    public void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
