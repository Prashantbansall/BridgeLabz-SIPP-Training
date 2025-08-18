import java.io.Serializable;

public class BackupData implements Serializable {
    private String fileName;
    private int size;

    public BackupData(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public String toString() {
        return "BackupData{fileName='" + fileName + "', size=" + size + "MB}";
    }
}
