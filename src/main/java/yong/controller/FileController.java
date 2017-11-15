package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import yong.file.model.FileDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FileController {

	@RequestMapping("/fileListForm.do")
	public ModelAndView fileListForm() {
		ModelAndView mav = new ModelAndView();
		String path = "F:/박상준/upload";
		File f = new File(path);
		ArrayList arr = new ArrayList();
		if (f.exists()) {
			String[] list = f.list();
			for (int i = 0; i < list.length; i++) {
				File f2 = new File(f.getPath() + "/" + list[i]);

				arr.add(f2.getPath());
			}
		}
		mav.addObject("arr", arr);
		mav.setViewName("file/fileListForm");
		return mav;
	}

	// 파일 다운로드 관련 메서드 시작
	@RequestMapping("/downloadList.do")
	public ModelAndView downloadList() {

		File f = new File("f:/박상준/upload/");
		File files[] = f.listFiles();
		ModelAndView mav = new ModelAndView();
		mav.addObject("fileList", files);
		mav.setViewName("file/downloadList");
		return mav;
	}

	@RequestMapping("/down.do")
	public ModelAndView downFile(
			@RequestParam("filename")String fn) {
		File f= new File("f:/박상준/upload/"+fn);
		ModelAndView mav = new ModelAndView("yongDown", "downloadFile", f);//다운로드 하고자하는 파일의 객체 정보만 넣으면된다.
		
		return mav;
	}

	// 파일 다운로드 관련 메서드 끝
	@RequestMapping("/fileUploadForm.do")
	public String fileUploadForm() {
		return "file/fileUploadForm";
	}

	@RequestMapping("/fileUpload1.do")
	public String fileUpload1(@RequestParam("writer") String writer, @RequestParam("upload") MultipartFile upload) {
		copyInto(writer, upload);
		return "file/fileOk";
	}

	@RequestMapping("/fileUpload2.do")
	public String fileUpload2(MultipartHttpServletRequest req) {
		String writer = req.getParameter("writer");
		MultipartFile upload = req.getFile("upload");
		copyInto(writer, upload);
		return "file/fileOk";
	}

	@RequestMapping("/fileUpload3.do")
	public String fileUpload3(FileDTO dto) {

		copyInto(dto.getWriter(), dto.getUpload());
		return "file/fileOk";
	}

	@RequestMapping("/fileUpload4.do")
	public String fileUpload3(@RequestParam("writer") String writer,
			@RequestParam("upload") List<MultipartFile> upload) {

		for (int i = 0; i < upload.size(); i++) {
			copyInto(writer, upload.get(i));
		}

		return "file/fileOk";
	}

	public void copyInto(String writer, MultipartFile upload) {
		System.out.println("작성자 : " + writer);
		System.out.println("올린파일 : " + upload.getOriginalFilename());// 원래 파일의 이름을 확인하기위한 메서드
		try {
			byte bytes[] = upload.getBytes();

			File newFile = new File("F:/박상준/upload/" + upload.getOriginalFilename());// 해당위치에 저장

			FileOutputStream fos = new FileOutputStream(newFile);
			fos.write(bytes); // 복사 코드가 된다.
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
