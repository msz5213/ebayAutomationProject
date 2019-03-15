package testcases;

import org.testng.annotations.Test;
import testpages.ObjectRepo;
import testpages.StoreFileInfoToList;

import java.io.FileNotFoundException;

public class ValidateItemCatDdLvsFile extends BaseTest {

    @Test
    public void validateItemsCatDdlvsListFile() throws FileNotFoundException {

        ItemCategoryDropDown itemCategoryDropDown = new ItemCategoryDropDown();
        StoreFileInfoToList storeFileInfoToList = new StoreFileInfoToList();

        if(itemCategoryDropDown.getItemCategoryDropDown().equals(storeFileInfoToList.storeItemCatDdlFile())) {
            System.out.println(ObjectRepo.listCompPass);
        } else if(itemCategoryDropDown.getItemCategoryDropDown() == (storeFileInfoToList.storeItemCatDdlFile())) {
            System.out.println(ObjectRepo.listCompPass);
        } else if(itemCategoryDropDown.getItemCategoryDropDown() != storeFileInfoToList.storeItemCatDdlFile()) {
            System.out.println(ObjectRepo.listCompFail);
        }
    }
}