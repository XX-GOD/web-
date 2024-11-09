package pojo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class MultiFileDomain {
    private List<String> description;
    private List<MultipartFile> myfile;
}
