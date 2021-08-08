package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.List;

public class Print extends Function {
    public Print(int i) {
        super(i);
        NAME = "print";
        PARAMS.add("msg");
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        T2LObject param = params.get(0);
        System.out.println(param.getString(executor));
        return new T2LObject();
    }
}
