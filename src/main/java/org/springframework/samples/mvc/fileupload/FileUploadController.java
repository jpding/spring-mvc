package org.springframework.samples.mvc.fileupload;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mvc.extensions.ajax.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileupload")
public class FileUploadController {
	
	private static final Logger log = LoggerFactory.getLogger(FileUploadController.class); 
	
	@ModelAttribute
	public void ajaxAttribute(WebRequest request, Model model) {
		log.info("================================");
		model.addAttribute("ajaxRequest", AjaxUtils.isAjaxRequest(request));
	}

	@RequestMapping(method=RequestMethod.GET)
	public void fileUploadForm() {
		log.info("================================");
	}

	@RequestMapping(method=RequestMethod.POST)
	public void processUpload(@RequestParam MultipartFile file, Model model) throws IOException {
		log.info("================================");
		model.addAttribute("message", "File '" + file.getOriginalFilename() + "' uploaded successfully");
	}
	
}
