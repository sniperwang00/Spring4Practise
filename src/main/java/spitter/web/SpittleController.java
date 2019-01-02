package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spitter.data.SpittlerRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

	private SpittlerRepository spittlerRepository;

	@Autowired
	public SpittleController(SpittlerRepository spittlerRepository){
		this.spittlerRepository = spittlerRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String spittles(Model model){
		System.out.println("spittles");
		model.addAttribute("spittleList", spittlerRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
}
