package homeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Reader implements Comparable<Reader> {

    private String nameReader;
    private String surnameReader;
    private String address;
    private String phone;
    private boolean readerBlackList;
    private int countIssue;

    private List<Issue> readerList;


//    public Reader(boolean readerBlackList) {
//        this.readerBlackList = readerBlackList;
//    }

    public Reader(String nameReader, String surnameReader, String address, String phone) {
        this.nameReader = nameReader;
        this.readerList = new ArrayList<>();
        this.surnameReader = surnameReader;
        this.address = address;
        this.phone = phone;
        this.countIssue = 0;
        this.readerBlackList = false;
    }

    public String getNameReader() {
        return nameReader;
    }

    public String getSurnameReader() {
        return surnameReader;
    }


    public String getAddress() {
        return address;
    }


    public String getPhone() {
        return phone;
    }

    public List<Issue> getReaderList() {
        return readerList;
    }

    public boolean isReaderBlackList() {
        return readerBlackList;
    }

    public void setReaderBlackList(boolean readerBlackList) {
        this.readerBlackList = readerBlackList;
    }

    public int getCountIssue() {
        return countIssue;
    }

    public void setCountIssue(int countIssue) {
        this.countIssue = countIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (isReaderBlackList() != reader.isReaderBlackList()) return false;
        if (getNameReader() != null ? !getNameReader().equals(reader.getNameReader()) : reader.getNameReader() != null)
            return false;
        if (getSurnameReader() != null ? !getSurnameReader().equals(reader.getSurnameReader()) : reader.getSurnameReader() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(reader.getAddress()) : reader.getAddress() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(reader.getPhone()) : reader.getPhone() != null)
            return false;
        return false;
    }

    @Override
    public int compareTo(Reader o) {
        if (this == o) return 0;

        if (this.nameReader != null) {
            return this.nameReader.compareTo(o.nameReader);
        }
        if (this.surnameReader != null) {
            return this.surnameReader.compareTo(o.surnameReader);
        }
        if (this.address != null) {
            return this.address.compareTo(o.address);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Reader - %1$s, %2$s, %3$s, phone - %4$s",
                nameReader, surnameReader, address, phone);
    }


    public String asString() {
        String tmp = "";
        for (int i = 0; i < readerList.size(); i++)
            tmp = readerList.get(i).toString();
        return tmp;
    }
}

