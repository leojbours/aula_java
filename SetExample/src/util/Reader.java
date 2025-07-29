package util;

import java.io.File;
import java.util.List;

public interface Reader<T>
{
    public List<T> read( File file );
}
