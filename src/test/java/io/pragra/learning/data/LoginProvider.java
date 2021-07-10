package io.pragra.learning.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoginProvider {
    private static final Logger logger = LogManager.getLogger(LoginProvider.class);

    @DataProvider(name = "logins")
    public Object[][] loginProvider(){
        logger.info("Inside method login Provider");
        Object [] [] data = { {"atin", "2i8jshs"} , {"leila","jkshhjs"} ,{"harishta","sjlksjhk"} };
        logger.error("Returning {} from loginProvider", Arrays.toString(data));
        return data;
    }

    @DataProvider(name = "logins2")
    public Iterator<Object[]> loginProvider2(){
        List<Object> dataSet1 = Arrays.asList("kamal","2i8jshs");
        List<Object> dataSet2 = Arrays.asList("abc","2sssi8jshs");
        List<Object[]> data = new ArrayList<>();
        data.add(dataSet1.toArray());
        data.add(dataSet2.toArray());
        return data.iterator();
    }
}
