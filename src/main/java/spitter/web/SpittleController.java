package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spitter.Spitter;
import spitter.Spittle;
import spitter.data.SpittlerRepository;

import javax.validation.Valid;


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

	@RequestMapping(value = "/show")
	public String spittlesById(@RequestParam("spittle_id")long id, Model model){
		model.addAttribute("spittleList", spittlerRepository.findById(id));
		return "spittles";
	}

	@RequestMapping(value="/{spittle_id}")
	public String spittleById(@PathVariable("spittle_id")long id, Model model){
		model.addAttribute("spittleList", spittlerRepository.findById(id));
		return "spittles";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {

		return "registerForm";
	}


	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String processRegister(@Valid Spitter spitter,Errors errors) {
		if(errors.hasErrors()){
			return "registerForm";
		}

		spittlerRepository.save(spitter);
		return "redirect:/spittles/profile/" + spitter.getUsername();
	}

	@RequestMapping(value = "/profile/{username}")
	public String spitterByUserName(@PathVariable("username") String username, Model model) {
		Spitter spitter = spittlerRepository.findByUserName(username);
		model.addAttribute(spitter);
		return "profile";
	}
}
