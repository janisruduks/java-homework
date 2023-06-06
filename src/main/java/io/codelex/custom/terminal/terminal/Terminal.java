package io.codelex.custom.terminal.terminal;


public class Terminal {
    private Folder currentFolder;

    public Terminal(Folder rootFolder) {
        this.currentFolder = rootFolder;
    }

    public String getPath() {
        if (this.currentFolder.getParent() != null) {
            return this.currentFolder.getParent().getName() + "/" + this.currentFolder.getName();
        } else {
            return this.currentFolder.getName();
        }
    }

    public void cd(String name) {
        if (name.equals("..")) {
            if (currentFolder.getParent() != null) {
                currentFolder = currentFolder.getParent();
            }
        } else {
            FileSystemObject target = currentFolder.get(name);
            if (target instanceof Folder) {
                currentFolder = (Folder) target;
            } else {
                System.out.println("Invalid directory");
            }
        }
    }


    public void touch(String name) {
        File file = new File(name);
        currentFolder.add(file);
    }

    public void mkdir(String name) {
        Folder folder = new Folder(name, currentFolder);
        currentFolder.add(folder);
    }

    public void ls() {
        this.currentFolder.list();
    }

    public void cat(String name) {
        if (currentFolder.doesFileExist(name)) {
            System.out.println(currentFolder.get(name).getContent());
        } else {
            System.out.println("Couldn't find file with name: " + name);
        }
    }

    public void printAllCommands() {
        String ls = "ls - Lists all the files and directories in the current directory.\n";
        String cd = "cd 'directory name' - Changes the current directory to the one specified.\n";
        String cd2 = "cd '..' - To move one directory up.\n";
        String mkdir = "mkdir 'directory name' - Creates new directory with specified name.\n";
        String touch = "touch 'file name' - Creates new text file with the specified name in the directory.\n";
        String cat = "cat 'file name' - Prints contents of a specified file.\n";
        String clear = "clear - Clears terminal screen.\n";
        String exit = "exit() - Kills this sacred program, " +
                "as you watch it close it's bit eyes, one tear drop runs down... \n" +
                "'YOU MONSTER' program's children scream at you." +
                "'Don't you dare to use it' children say";

        System.out.println(ls + cd + cd2 + mkdir + touch + cat + clear + exit);
    }

    public void printLogo() {
        System.out.println("""
                888b    888  .d8888b.   .d8888b.  888  88888888888                            \s
                8888b   888 d88P  Y88b d88P  Y88b 888      888                                \s
                88888b  888 888    888 888    888 888      888                                \s
                888Y88b 888 888    888 888    888 88888b.  888   .d88b.  888d888 88888b.d88b. \s
                888 Y88b888 888    888 888    888 888 "88b 888  d8P  Y8b 888P"   888 "888 "88b\s
                888  Y88888 888    888 888    888 888  888 888  88888888 888     888  888  888\s
                888   Y8888 Y88b  d88P Y88b  d88P 888 d88P 888  Y8b.     888     888  888  888\s
                888    Y888  "Y8888P"   "Y8888P"  88888P"  888   "Y8888  888     888  888  888\s
                                """);
    }

    public void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
