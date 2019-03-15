package testcases;

import org.testng.annotations.Test;
import testpages.ObjectRepo;

public class ValidateItemsDropDownVsItemList extends BaseTest {

    @Test
    public void validateItemsDropDownVsItemList(){

        ItemCategoryDropDown itemCategoryDropDown = new ItemCategoryDropDown();

        if(itemCategoryDropDown.getItemCategoryDropDown().equals(ObjectRepo.createItemCatDdList())) {
            System.out.println(ObjectRepo.listCompPass);
        } else if(itemCategoryDropDown.getItemCategoryDropDown() == ObjectRepo.createItemCatDdList()) {
            System.out.println(ObjectRepo.listCompPass);
        } else if(itemCategoryDropDown.getItemCategoryDropDown() != ObjectRepo.createItemCatDdList());{
            System.out.println(ObjectRepo.listCompFail);
        }
    }
}