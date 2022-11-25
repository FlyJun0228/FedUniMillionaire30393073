package au.edu.federation.itech3107.fedunimillionaire30393073.Json;

import org.json.JSONObject;

public class CreateJson {
    public String Create(String category,String type,String difficulty,String question,String correct_answer,String[] incorrect_answers ){
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("category", category);
            jsonObject.put("type", type);
            jsonObject.put("difficulty", difficulty);
            jsonObject.put("question", question);
            jsonObject.put("correct_answer", correct_answer);
            jsonObject.put("incorrect_answers", incorrect_answers);
            return jsonObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return"";
    }
}
