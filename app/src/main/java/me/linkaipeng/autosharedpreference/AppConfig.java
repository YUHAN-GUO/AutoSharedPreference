package me.linkaipeng.autosharedpreference;

import java.util.Set;

import me.linkaipemg.autospannotation.AutoGenerateField;
import me.linkaipemg.autospannotation.AutoSharedPreferences;

/**
 * Created by linkaipeng on 2019/4/4.
 */
@AutoSharedPreferences
public class AppConfig {

    @AutoGenerateField(filedName = "StudentName", defaultStringValue = "ddd", commitType = AutoGenerateField.CommitType.APPLY)
    private String name;

    @AutoGenerateField(defaultIntValue = -10)
    private int count;

    @AutoGenerateField(defaultLongValue = 90l, commitType = AutoGenerateField.CommitType.COMMIT)
    private long startTime;

    @AutoGenerateField(defaultBooleanValue = true)
    private boolean isClose;

    @AutoGenerateField(defaultFloatValue = 0.534534534f)
    private float price;

    @AutoGenerateField
    private Set<String> productSet;
}
