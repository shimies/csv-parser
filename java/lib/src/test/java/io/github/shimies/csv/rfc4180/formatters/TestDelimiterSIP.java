package io.github.shimies.csv.rfc4180.formatters;

import io.github.shimies.csv.Newline;
import io.github.shimies.csv.rfc4180.FormatterTest;

public class TestDelimiterSIP extends FormatterTest {

    @Override
    protected int delimiter() {
        return 0x20bb7;
    }

    @Override
    protected boolean allowRecordEndWithEmptyField() {
        return false;
    }

    @Override
    protected Newline newline() {
        return Newline.CRLF;
    }

}
