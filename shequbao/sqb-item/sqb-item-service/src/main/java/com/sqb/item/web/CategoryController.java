package com.sqb.item.web;

import com.sqb.item.pojo.Category;
import com.sqb.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 余建强
 * @date 2019/12/4 17:24
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public List<Category> queryCategoryListByPid(@RequestParam("pid")Long pid){
        return categoryService.queryCategoryListByPid(pid);
    }
}
