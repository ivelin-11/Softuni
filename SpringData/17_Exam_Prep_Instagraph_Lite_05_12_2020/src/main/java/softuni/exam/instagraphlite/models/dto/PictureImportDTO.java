package softuni.exam.instagraphlite.models.dto;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PictureImportDTO {

   @NotNull
    private String path;

   @NotNull
   @Min(500)
   @Max(60000)
    private double size;

    public String getPath() {
        return path;
    }

    public double getSize() {
        return size;
    }
}
