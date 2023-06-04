package io.codelex.custom.terminal;

public class Terminal {
    private String path = "/";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = this.path + path + "/";
    }

    public void setPathBack() {
        String[] fullPath = this.path.split("/");
        StringBuilder newPath = new StringBuilder();
        for (int i = 0; i < fullPath.length - 1; i++) {
            newPath.append(fullPath[i]).append("/");
        }
        this.path = String.valueOf(newPath);
    }
}
