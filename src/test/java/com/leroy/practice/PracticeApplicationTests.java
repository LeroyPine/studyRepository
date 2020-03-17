package com.leroy.practice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.async.AsyncService;
import com.leroy.practice.enums.BeEvaluatePersonTypeEnum;
import com.leroy.practice.garabe.ArrayTest;
import com.leroy.practice.model.PR;
import com.leroy.practice.model.User;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {


    @Autowired
    private AsyncService asyncService;

    /*
        @Resource
        private LeroySender leroySender;
       *//* @Resource
    private CallBackSender callBackSender;*//*
    @Resource
    private StringRedisTemplate stringRedisTemplate;*/
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
        System.out.println(System.currentTimeMillis() + "");
        //leroySender.send();   //测试发送

        // leroySender.send1();

        //leroySender.send2();

        Assert.isTrue(1 > 2, "错误");
        System.out.println(123);

        ArrayTest arrayTest = new ArrayTest();
        arrayTest.setName("123");
        arrayTest.setTitle("第一次");
        List<ArrayTest> arrayTests = Arrays.asList(arrayTest);
        System.out.println(arrayTest);
    }


    @Test
    public void test1() {
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
/*

        List<String> st = new ArrayList<>();
        st.add("12");
        boolean notEmpty = CollectionUtils.isNotEmpty(st);
        System.out.println(notEmpty);
*/


        //queryBuilder.must( QueryBuilders.termQuery("projectId","8a9099cb611da272016140e3165e042a"));

        // queryBuilder.should( QueryBuilders.termQuery("evaluatorName","490937"));

      /*  queryBuilder.should(QueryBuilders.termQuery("collectCode", "490942"));
        queryBuilder.should(QueryBuilders.termQuery("collectCode", "490937"));*/
     /*   SearchQuery searchQuery = new NativeSearchQuery(queryBuilder);
        searchQuery.setPageable(PageRequest.of(0, 100));
        searchQuery.addSort(Sort.by("evaluateTime").ascending());
        List<Integer> stars = new ArrayList<>();
        stars.add(2);stars.add(1);
        queryBuilder.must(QueryBuilders.termsQuery(EsConstant.evaluate_zry.zoStar,stars));

        //范围查询
        RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery(EsConstant.evaluate_zry.zoScore);
        rangeQueryBuilder.lt(50.0);
        rangeQueryBuilder.gte(40.0);

        queryBuilder.must(rangeQueryBuilder);
        List<ZryEvaluateEntity> zryEvaluateEntityList = elasticsearchTemplate.queryForList(searchQuery, ZryEvaluateEntity.class);
        System.out.println(zryEvaluateEntityList);*/


      /*  List<ZryEvaluateEntity> zryEvaluateEntityList=elasticsearchTemplate.queryForList(searchQuery,ZryEvaluateEntity.class);
        System.out.println(zryEvaluateEntityList);*/


        List<String> las = new ArrayList<>();
         las.add("!#2");
         las.add("12312");
        PR pr = new PR();
        pr.setAs(las);
       /* pr.setUsers(las);
        las.add(new User("12", "12"));
        las.add(new User("12", "12"));*/

        String s1 = JSONObject.toJSONString(pr);
        System.out.println(s1);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        LinkedHashMap<Integer, Long> collect1 = collect.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        Integer key = collect1.entrySet().stream().collect(Collectors.toList()).stream().findFirst().get().getKey();
        System.out.println(key);
        //让map变得有序
        /*Map<Integer, List<Integer>> sortMap = new LinkedHashMap<>();
        collect.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                forEachOrdered(e -> sortMap.put(e.getKey(), e.getValue()));
        System.out.println(sortMap);
*/


        System.out.println(collect);
    }


    @Test
    public void test45() {
    /*    List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);

        String join = StringUtils.join(list, ",");
        System.out.println(join);*/

//''
        if (1==1){
            System.out.println(123);
            return;
        }
        System.out.println(155151);
/*
        String s1 = JSON.toJSONString(list);
        System.out.println(s1);
        String s = "as";
        String[] split = s.split(",");

        System.out.println(split[0]);
        boolean notBlank = StringUtils.isNotBlank(s);
        System.out.println(notBlank);*/
    }






/*
@Test
    public void oneToMany() {

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);


        arrayList.forEach(ar->{
            if (ar == 1){
                throw new Exception();
            }
        });

    }
*/


/*

    @Test
    public void topicConfirm() {
        callBackSender.send("topic.#", "测试mq的确认提交");
    }



    @Resource
    private RedisLock redisLock;

    @Test
    public void contextLoads1() {
  try {
        ArrayList<Thread> list = new ArrayList<>();
        for(int i =0; i<20; i++) {
            //logger.info("线程开始");
            Thread t = new Thread() {
                @Override
                public void run() {
                    redisLock.sellTicket();
                }
            };
            list.add(t);
            t.start();
        }
        for(Thread t : list) {
            t.join();
        }
        Thread.sleep(10000);
    }
    catch (Exception e){

    }

        System.out.println("MOT"+2);
    }


    @Test
    public void test290(){
        List<String> list1=new ArrayList<>();

        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<User> list2=new ArrayList<>();
        User u = new User();  u.setAge("3");
        User u1 = new User(); u1.setAge("2");
        User u3 = new User(); u3.setAge("1");
        list2.add(u);
        list2.add(u1);
        list2.add(u3);


        List<String> collect1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("===========");
        List<User> collect = list2.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        collect.forEach(u123->{
            System.out.println(u123.getAge()    );
                }
        );

  System.out.println("====求交集===");

        List<Integer> list=list1.stream().filter(t->list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);




        System.out.println("====求差集===");
        list=list1.stream().filter(t-> !list2.contains(t)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);


        System.out.println("====求并集===");

        list.addAll(list1);
        list.addAll(list2);
        list=list.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::println);

    }


*/

    @Test
    public void rando() {
        List<Integer> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();  //新的List
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Random random = new Random();
        for (int j = 0; j < 2; j++) {
            int i = random.nextInt(list.size());  //随机生成一个  0~list.size() 的数   不包含 list.size()
            System.out.println("=============" + i);
            if (!tempList.contains(i)) {
                tempList.add(i);
                newList.add(list.get(i));
            } else {
                j--;         //控制循环的次数
            }
        }
        System.out.println(newList);

    }


}
