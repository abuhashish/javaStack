package com.codingdojo.DojoOverFlow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.codingdojo.DojoOverFlow.models.Answer;
import com.codingdojo.DojoOverFlow.models.Question;
import com.codingdojo.DojoOverFlow.models.Tag;
import com.codingdojo.DojoOverFlow.models.newQuestion;
import com.codingdojo.DojoOverFlow.repositories.AnswerRepository;
import com.codingdojo.DojoOverFlow.repositories.QuestionRepository;
import com.codingdojo.DojoOverFlow.repositories.TagRepository;
import com.codingdojo.DojoOverFlow.repositories.tags_questionsRepository;
@Service
public class ofServices {
private final QuestionRepository QR;
private final AnswerRepository AR;
private final TagRepository TR;
private final tags_questionsRepository TQR;
public ofServices(QuestionRepository qR, AnswerRepository aR, TagRepository tR, tags_questionsRepository tQR) {
	QR = qR;
	AR = aR;
	TR = tR;
	TQR = tQR;
}
public Tag createTag(Tag b) {
	return TR.save(b);
}
public Question createQuestion(String x) {
	Question quest=new Question();
	quest.setText(x);
	return QR.save(quest);
}

public void createQuestion(@Valid newQuestion x) {
	List<Tag> questionsTags = new ArrayList<Tag>();
	for(String subject: x.splitTags()) {
		Tag tag = this.TR.findBySubject(subject).orElse(null);
		if(tag == null) {
			tag = new Tag();
			tag.setSubject(subject);
			this.TR.save(tag);
		}
		// prevent dupe tags
		if(!questionsTags.contains(tag))
			questionsTags.add(tag);
	}
	Question newQuestion = new Question();
	newQuestion.setTags(questionsTags);
	newQuestion.setText(x.getQuestion());
	this.QR.save(newQuestion);
}
public List<Question> findallquestions(){
	return QR.findAll();
}
public Question findbyid(Long id){
	Optional<Question> x = QR.findById(id);
	if (x.isPresent()) {
		return x.get();
	} else {
		return null;
	}
}
public void createAnswer(@Valid Answer x) {
	AR.save(x);
	
}

}
