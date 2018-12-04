package jin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jin.domain.Product;
import jin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page,
                                @RequestParam(name = "size",required = true,defaultValue = "4")int size)throws Exception{
        ModelAndView mv=new ModelAndView();
        List<Product> list = productService.findAll(page,size);
        mv.addObject("productList",list);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo=new PageInfo(list);
        mv.addObject("productList1",pageInfo);
        mv.setViewName("product-list1");
        return mv;
    }
    //产品添加
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }

}
