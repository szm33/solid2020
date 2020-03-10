package pl.zzpj2020.cleancode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ListToHashMapConverterTest {

    @Test
    public void convertCheck(){
        List<Integer> values = new LinkedList<>();
        int value1 = 2;
        int value2 = 3;
        values.add(value1);
        values.add(value1);
        values.add(value2);
        ListToHashMapConverter hashMapConverter = new ListToHashMapConverter(values);
        Assert.assertEquals(2,hashMapConverter.getValueHashMap().size());
        Assert.assertEquals(2,hashMapConverter.getValueHashMap().get(2).intValue());
        Assert.assertEquals(1,hashMapConverter.getValueHashMap().get(3).intValue());
    }

    @Test
    public void minMaxKeyCheck(){
        List<Integer> values = new LinkedList<>();
        int value1 = 2;
        int value2 = 3;
        values.add(value1);
        values.add(value1);
        values.add(value2);
        ListToHashMapConverter hashMapConverter = new ListToHashMapConverter(values);
        Assert.assertEquals(value1,hashMapConverter.getMinValue());
        Assert.assertEquals(value2,hashMapConverter.getMaxValue());
    }

}