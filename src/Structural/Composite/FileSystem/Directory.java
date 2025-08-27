package Structural.Composite.FileSystem;

import java.util.List;

public class Directory implements FileSystem {
    private final String name;
    private final List<FileSystem> fileSystems;

    public Directory(String name, List<FileSystem> fileSystems) {
        this.name = name;
        this.fileSystems = fileSystems;
    }

    @Override
    public void ls() {
        System.out.println("Directory : " + name);
        for (FileSystem fileSystem : fileSystems) {
          fileSystem.ls();
        }

    }
}
