package util;

import java.io.File;
import java.util.Collection;

public interface Reader<T>
{
    Collection<T> read( File file );
}
