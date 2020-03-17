package com.leroy.practice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.model.APIEvaluateQuestionsContentsRequest;
import com.leroy.practice.model.DikeEvaluateResult;
import com.leroy.practice.model.OldEvaluateQueryConditionRequest;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.google.common.collect.Lists.newArrayList;

import java.util.*;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2019年10月10日 11:14
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonTest {

    @Test
    public void test1() {

        List<APIEvaluateQuestionsContentsRequest> userAnswerList = new ArrayList<>();
        List<APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest> questions = new ArrayList<>();
        List<APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest> subQuestions = new ArrayList<>();


        //setSub(subQuestions);

 /*       APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest questionOptionsRequest = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        questionOptionsRequest.setCode("525");
        questionOptionsRequest.setOptionCode("4293");
        questionOptionsRequest.setSubQuestions(subQuestions);*/

        ////
      /*  APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest questionOptionsRequest1 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        questionOptionsRequest1.setCode("526");
        questionOptionsRequest1.setOptionCode("");*/


        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest.setCode("QUE2019101020170108");
        evaluateQuestionOptionsRequest.setOptionCode("ANS2019101020170446");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest1 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest1.setCode("QUE2019101020170111");
        evaluateQuestionOptionsRequest1.setOptionCode("ANS2019101020170454");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest2 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest2.setCode("QUE2019101020170115");
        evaluateQuestionOptionsRequest2.setOptionCode("ANS2019101020170467");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest3 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest3.setCode("782");
        evaluateQuestionOptionsRequest3.setOptionCode("4996");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest4 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest4.setCode("QUE2019101020170109");
        //   evaluateQuestionOptionsRequest.setOptionCode("4997");
        evaluateQuestionOptionsRequest4.setContent("本来这次涨价200，很感谢管家帮我沟通，降了100。还是比较喜欢住自如的房子，住着安心，踏实，有问题都第一时间帮忙解决");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest5 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest5.setCode("QUE2019101020170112");
        evaluateQuestionOptionsRequest5.setOptionCode("ANS2019101020170457");


        //   questions.add(questionOptionsRequest);
        questions.add(evaluateQuestionOptionsRequest);
        questions.add(evaluateQuestionOptionsRequest1);
        questions.add(evaluateQuestionOptionsRequest2);
        questions.add(evaluateQuestionOptionsRequest3);
        questions.add(evaluateQuestionOptionsRequest4);
        questions.add(evaluateQuestionOptionsRequest5);


        APIEvaluateQuestionsContentsRequest.EvaluateQuestionMsgRequest evaluateQuestionMsgRequest = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionMsgRequest();
        evaluateQuestionMsgRequest.setRequesterType("ziroomer");
        evaluateQuestionMsgRequest.setRequesterId("e753c3f7-55fb-4d7c-b93f-f2ca5cfe7ecf");
        evaluateQuestionMsgRequest.setQuestions(questions);
      /*  evaluateQuestionMsgRequest.setRequesterName("任孟");

        evaluateQuestionMsgRequest.setRequesterPhone("18721797689");*/
        evaluateQuestionMsgRequest.setOrderCode("BJZYCW81811093405-01");


        userAnswerList.add(APIEvaluateQuestionsContentsRequest.builder()
                .collectId("10856184")
                .evaluateMsg(evaluateQuestionMsgRequest)
                .build());


        String s = JSON.toJSONString(userAnswerList);
        System.out.println(s);


    }


    public void setSub(List<APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest> subQuestions) {
        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest.setCode("QUE2019101020170108");
        evaluateQuestionOptionsRequest.setOptionCode("ANS2019101020170446");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest1 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest1.setCode("QUE2019101020170111");
        evaluateQuestionOptionsRequest1.setOptionCode("ANS2019101020170454");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest2 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest2.setCode("QUE2019101020170115");
        evaluateQuestionOptionsRequest2.setOptionCode("ANS2019101020170467");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest3 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest3.setCode("782");
        evaluateQuestionOptionsRequest3.setOptionCode("4996");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest4 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest4.setCode("QUE2019101020170109");
        //   evaluateQuestionOptionsRequest.setOptionCode("4997");
        evaluateQuestionOptionsRequest4.setContent("本来这次涨价200，很感谢管家帮我沟通，降了100。还是比较喜欢住自如的房子，住着安心，踏实，有问题都第一时间帮忙解决");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest evaluateQuestionOptionsRequest5 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest5.setCode("QUE2019101020170112");
        evaluateQuestionOptionsRequest5.setOptionCode("ANS2019101020170457");

      /*  APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest  evaluateQuestionOptionsRequest6 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest6.setCode("782");
        evaluateQuestionOptionsRequest6.setOptionCode("4999");

        APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest  evaluateQuestionOptionsRequest7 = new APIEvaluateQuestionsContentsRequest.EvaluateQuestionOptionsRequest();
        evaluateQuestionOptionsRequest7.setCode("782");
        evaluateQuestionOptionsRequest7.setOptionCode("5000");
*/
        subQuestions.add(evaluateQuestionOptionsRequest);
        subQuestions.add(evaluateQuestionOptionsRequest1);
        subQuestions.add(evaluateQuestionOptionsRequest2);
        subQuestions.add(evaluateQuestionOptionsRequest3);
        subQuestions.add(evaluateQuestionOptionsRequest4);
        subQuestions.add(evaluateQuestionOptionsRequest5);
      /*  subQuestions.add(evaluateQuestionOptionsRequest6);
        subQuestions.add(evaluateQuestionOptionsRequest7);*/
    }


    @Test
    public void test2() {

        List<DikeEvaluateResult> dikeEvaluateResults = new ArrayList<>();


        List<DikeEvaluateResult.QuestionAnswersRequest> questionAnswersRequests = new ArrayList<>();

        DikeEvaluateResult.QuestionAnswersRequest answersRequest = new DikeEvaluateResult.QuestionAnswersRequest();
        answersRequest.setQuestionCode("1099");
        answersRequest.setOptionCode("6118");
        answersRequest.setParentOptionCode(null);

        DikeEvaluateResult.QuestionAnswersRequest answersRequest1 = new DikeEvaluateResult.QuestionAnswersRequest();
        answersRequest1.setQuestionCode("1095");
        answersRequest1.setOptionCode("6133");
        answersRequest.setParentOptionCode(null);

        questionAnswersRequests.add(answersRequest);
        questionAnswersRequests.add(answersRequest1);


        DikeEvaluateResult dikeEvaluateResult = new DikeEvaluateResult();

        dikeEvaluateResult.setDataSource(14);
        dikeEvaluateResult.setCollectCode("10751134");
        dikeEvaluateResult.setSceneType(1);
        dikeEvaluateResult.setSceneCode("CSM2BJPJ");
        dikeEvaluateResult.setEvaluatedPersonCode("60016798");
        dikeEvaluateResult.setRequesterId("d27c1675-6901-89ce-6a1c-374eeaef758a");
        dikeEvaluateResult.setRequesterType("ziroomer");
        dikeEvaluateResult.setBusinessCode("SJ120491468094016");
        dikeEvaluateResult.setExt(null);
        dikeEvaluateResult.setIsAgreeCallBack(null);
        dikeEvaluateResult.setQuestionAnswers(questionAnswersRequests);

        dikeEvaluateResults.add(dikeEvaluateResult);


        String s = JSON.toJSONString(dikeEvaluateResults);
        System.out.println(s);

    }


    @Test
    public void test3() {
        List<String> bizCodeList = new ArrayList<>();
        bizCodeList.add("BJZYCW81811036430-01");
        Map<String, Object> paramMap = new HashMap<>(3);
        paramMap.put("bizCodeList", bizCodeList);
        paramMap.put("sceneCode", "XYPJ2");
        paramMap.put("beEvaluatorId", "60010233");
        String s = JSONObject.toJSONString(paramMap);
        System.out.println(s);
    }


    @Test
    public void test4() {
        List<OldEvaluateQueryConditionRequest> list = new ArrayList<>();
        OldEvaluateQueryConditionRequest evaluateQueryConditionRequest = new OldEvaluateQueryConditionRequest();
        evaluateQueryConditionRequest.setEvaluateSceneCode("XYPJ");
        evaluateQueryConditionRequest.setBusinessCodeList(newArrayList("BJGZWD16919169-01"));
        list.add(evaluateQueryConditionRequest);
        String s = JSONObject.toJSONString(list);
        System.out.println(s);
    }

    @Test
    public void test5() {
List<String> path1 = new ArrayList<>();
        List<String> path = new ArrayList<>();
        path.add("1");
        path.add("2");
        System.out.println(path);
        Collections.reverse(path);
        Object[] array = path.toArray();
        CollectionUtils.reverseArray(array);

        for (String s : path) {
            path1.add(s);
        }

        System.out.println(path1);
        System.out.println(path);


        String join = StringUtils.join(path, "-->");
        System.out.println(join);
        Object[] objects = array;
        System.out.println(objects);
    }


    @Test
    public void test6(){
        try{
             int a =  5 / 0 ;
        }catch (Exception e){
            System.out.println(e);
        }

    }
}


