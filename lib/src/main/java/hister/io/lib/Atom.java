package hister.io.lib;

import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by <a href="http://about.me/kh.bakhtiari">Khaled Bakhtiari</a> on 11/14/2016.
 *
 * @author Khaled Bakhtiari
 */
public interface Atom extends Parcelable {

    @NonNull
    String id();


    interface IBuilder<T extends IBuilder> {

        T id(String atom);

    }
}