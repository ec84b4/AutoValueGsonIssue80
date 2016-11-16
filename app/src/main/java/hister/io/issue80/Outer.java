package hister.io.issue80;

import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import hister.io.lib.Atom;


/**
 * Created by <a href="http://about.me/kh.bakhtiari">Khaled Bakhtiari</a> on 11/16/2016.
 *
 * @author Khaled Bakhtiari
 */
@AutoValue
public abstract class Outer implements Parcelable {

    public static TypeAdapter<Outer> adapter(Gson gson) {
        return null;
    }

    @NonNull
    public abstract Atom atom();

}
