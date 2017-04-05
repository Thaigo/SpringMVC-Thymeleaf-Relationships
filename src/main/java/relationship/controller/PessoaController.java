package relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import relationship.model.Pessoa;
import relationship.model.TipoPessoa;
import relationship.repository.EstadoRepository;
import relationship.repository.FilhoRepository;
import relationship.repository.GrupoRepository;
import relationship.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private FilhoRepository filhoRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
		
	
	@GetMapping("/pessoas")
	public ModelAndView listar(Pessoa pessoas) {
		ModelAndView mv = new ModelAndView("/pessoas/index");
				mv.addObject("pessoas", pessoaRepository.findAll());	
				
			return mv;
	}
	
	@GetMapping("/pessoas/show/{id}")
	public ModelAndView show(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("/pessoas/show");
		 mv.addObject("pessoa", pessoaRepository.findOne(id));
		 mv.addObject("filhos", filhoRepository.findAll());
		 mv.addObject("grupos", grupoRepository.findAll());
		 
		 return mv;
	}
	
	@GetMapping("/pessoas/new")
	public ModelAndView add(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView("/pessoas/new");
		mv.addObject("pessoa", pessoa);	
		mv.addObject("tiposPessoa", TipoPessoa.values());
		mv.addObject("estados", estadoRepository.findAll());
		
		return mv;
	}
	
	@PostMapping("/pessoas/create")
	public ModelAndView create(Pessoa pessoa) {		
		pessoaRepository.save(pessoa);
		
		
		return listar(pessoa);
	}

}
