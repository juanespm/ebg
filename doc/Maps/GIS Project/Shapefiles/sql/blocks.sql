USE FlyersMaps;

CREATE TABLE BLOCKS 
(
    id INT NOT NULL PRIMARY KEY ,
    zone_num INT, 
    block_num INT
);

ALTER TABLE BLOCKS ADD ogc_geom GEOMETRY; 

INSERT INTO BLOCKS VALUES('1','4','16',GeometryFromText('MULTIPOLYGON(((-7036170.829462484456599 -2012380.554411808261648 ,-7036119.713783792220056 -2012375.260878739878535 ,-7036119.713783792220056 -2012376.915107823675498 ,-7036120.210052517242730 -2012378.403913999209180 ,-7036120.540898334234953 -2012379.561874357983470 ,-7036120.871744151227176 -2012381.381526350276545 ,-7036122.029704509302974 -2012383.035755434073508 ,-7036123.353087776340544 -2012384.689984518103302 ,-7036125.007316860370338 -2012386.509636510396376 ,-7036125.669008494354784 -2012387.998442685930058 ,-7036126.992391761392355 -2012389.983517586486414 ,-7036130.135427020490170 -2012393.622821571072564 ,-7036131.293387379497290 -2012394.946204838110134 ,-7036132.782193554565310 -2012397.096702647395432 ,-7036134.436422638595104 -2012399.081777547951788 ,-7036135.594382997602224 -2012400.736006631748751 ,-7036138.075726623646915 -2012403.548196074552834 ,-7036140.557070249691606 -2012406.525808425387368 ,-7036142.542145149782300 -2012408.180037509417161 ,-7036145.354334592819214 -2012410.661381135229021 ,-7036148.497369851917028 -2012413.308147669536993 ,-7036151.640405111014843 -2012415.624068386852741 ,-7036156.106823638081551 -2012418.105412012664601 ,-7036158.588167264126241 -2012418.932526554679498 ,-7036161.565779614262283 -2012420.090486913453788 ,-7036166.528466866351664 -2012420.255909821949899 ,-7036167.686427225358784 -2012420.255909821949899 ,-7036168.182695950381458 -2012419.759641096694395 ,-7036171.160308301448822 -2012381.546949258539826 ,-7036170.829462484456599 -2012380.554411808261648 )))',-1) );
INSERT INTO BLOCKS VALUES('2','4','15',GeometryFromText('MULTIPOLYGON(((-7036249.901612695306540 -2012388.329288502689451 ,-7036188.695136590860784 -2012382.208640892291442 ,-7036187.040907506830990 -2012382.208640892291442 ,-7036185.717524239793420 -2012383.035755434073508 ,-7036184.890409697778523 -2012383.862869976088405 ,-7036184.394140972755849 -2012384.689984518103302 ,-7036184.063295155763626 -2012385.682521968381479 ,-7036180.754836988635361 -2012417.609143287641928 ,-7036180.754836988635361 -2012418.767103646416217 ,-7036181.747374438680708 -2012419.925064004957676 ,-7036182.409066072665155 -2012421.083024363731965 ,-7036183.567026430740952 -2012421.579293088987470 ,-7036185.221255514770746 -2012422.406407631002367 ,-7036186.544638781808317 -2012422.406407631002367 ,-7036245.600617077201605 -2012425.549442890333012 ,-7036246.593154527246952 -2012425.549442890333012 ,-7036246.924000344239175 -2012425.053174165077507 ,-7036247.420269069261849 -2012424.556905440054834 ,-7036251.555841779336333 -2012389.321825952967629 ,-7036251.059573054313660 -2012388.660134319448844 ,-7036249.901612695306540 -2012388.329288502689451 )))',-1) );
INSERT INTO BLOCKS VALUES('3','4','14',GeometryFromText('MULTIPOLYGON(((-7036336.252370875328779 -2012374.599187106359750 ,-7036335.425256333313882 -2012373.937495472608134 ,-7036266.774749351665378 -2012366.658887503668666 ,-7036265.616788992658257 -2012367.320579137187451 ,-7036264.624251542612910 -2012368.313116587465629 ,-7036258.669026840478182 -2012421.248447272228077 ,-7036258.834449748508632 -2012423.233522172784433 ,-7036259.826987198553979 -2012423.895213806303218 ,-7036261.150370466522872 -2012424.722328348318115 ,-7036325.996150555089116 -2012427.534517790889367 ,-7036327.981225455179811 -2012427.203671974129975 ,-7036329.139185814186931 -2012426.872826157370582 ,-7036329.470031631179154 -2012426.211134523851797 ,-7036330.297146173194051 -2012424.556905440054834 ,-7036336.252370875328779 -2012374.599187106359750 )))',-1) );
INSERT INTO BLOCKS VALUES('4','3','1',GeometryFromText('MULTIPOLYGON(((-7036429.550891207531095 -2012270.465466274879873 ,-7036372.314564904198050 -2012264.179395756218582 ,-7036369.667798370122910 -2012264.179395756218582 ,-7036367.682723470032215 -2012265.502779023256153 ,-7036366.690186019055545 -2012266.164470656774938 ,-7036364.374265301972628 -2012268.480391374323517 ,-7036364.043419484980404 -2012270.465466274879873 ,-7036361.065807133913040 -2012294.948056716704741 ,-7036360.073269683867693 -2012297.263977434020489 ,-7036358.419040599837899 -2012298.256514884531498 ,-7036357.095657332800329 -2012299.249052334809676 ,-7036355.441428248770535 -2012300.241589785087854 ,-7036354.118044981732965 -2012301.564973052125424 ,-7036353.125507531687617 -2012303.880893769674003 ,-7036351.802124264650047 -2012305.865968670463189 ,-7036351.140432630665600 -2012307.520197754260153 ,-7036340.222520677372813 -2012404.127176253823563 ,-7036340.553366493433714 -2012406.443096971372142 ,-7036341.215058127418160 -2012407.104788604890928 ,-7036342.538441394455731 -2012408.097326055169106 ,-7036343.200133027508855 -2012408.759017688687891 ,-7036344.523516295477748 -2012409.089863505447283 ,-7036346.177745378576219 -2012409.420709322206676 ,-7036407.384221483021975 -2012412.398321673274040 ,-7036410.030988017097116 -2012412.067475856514648 ,-7036411.685217101126909 -2012412.067475856514648 ,-7036413.008600368164480 -2012412.067475856514648 ,-7036414.001137819141150 -2012411.074938406236470 ,-7036415.324521086178720 -2012410.413246772717685 ,-7036416.317058536224067 -2012409.751555139198899 ,-7036416.317058536224067 -2012408.428171871928498 ,-7036430.543428657576442 -2012272.781386992428452 ,-7036429.550891207531095 -2012270.465466274879873 )))',-1) );
INSERT INTO BLOCKS VALUES('5','4','10',GeometryFromText('MULTIPOLYGON(((-7036178.273493364453316 -2012284.112856216961518 ,-7036103.336915863677859 -2012276.999671156285331 ,-7036102.178955504670739 -2012276.999671156285331 ,-7036101.186418054625392 -2012277.661362789804116 ,-7036100.690149329602718 -2012278.653900240082294 ,-7036100.359303512610495 -2012279.811860598856583 ,-7036115.412788175977767 -2012366.824310411931947 ,-7036116.074479809962213 -2012368.147693678969517 ,-7036117.067017260007560 -2012368.809385312488303 ,-7036118.059554710052907 -2012369.471076946239918 ,-7036169.836925036273897 -2012375.095455831382424 ,-7036170.664039578288794 -2012375.095455831382424 ,-7036171.656577028334141 -2012374.599187106126919 ,-7036171.987422845326364 -2012374.268341289367527 ,-7036172.649114478379488 -2012373.772072564344853 ,-7036180.754836989566684 -2012286.263354026013985 ,-7036180.258568264544010 -2012284.939970758976415 ,-7036178.273493364453316 -2012284.112856216961518 )))',-1) );
INSERT INTO BLOCKS VALUES('6','4','13',GeometryFromText('MULTIPOLYGON(((-7036257.511066482402384 -2012326.461120764957741 ,-7036191.176480217836797 -2012318.851666979026049 ,-7036185.221255515702069 -2012369.305654037743807 ,-7036185.055832607671618 -2012371.786997663788497 ,-7036185.552101332694292 -2012373.110380930826068 ,-7036186.379215874709189 -2012374.433764197863638 ,-7036186.875484599731863 -2012375.591724556637928 ,-7036187.868022049777210 -2012376.418839098652825 ,-7036189.191405316814780 -2012376.749684915412217 ,-7036251.721264688298106 -2012383.862869976088405 ,-7036258.007335207425058 -2012327.122812398476526 ,-7036257.511066482402384 -2012326.461120764957741 )))',-1) );
INSERT INTO BLOCKS VALUES('7','4','5',GeometryFromText('MULTIPOLYGON(((-7036106.645374030806124 -2012271.871560996398330 ,-7036180.754836989566684 -2012279.315591873833910 ,-7036181.912797347642481 -2012278.653900240315124 ,-7036184.559563881717622 -2012246.727278921054676 ,-7036184.063295156694949 -2012245.734741470776498 ,-7036182.739911889657378 -2012244.907626928761601 ,-7036106.479951121844351 -2012237.463596051326022 ,-7036110.946369648911059 -2012240.275785493897274 ,-7036111.938907098956406 -2012241.433745852671564 ,-7036112.600598732940853 -2012243.584243661724031 ,-7036114.089404908008873 -2012246.892701829550788 ,-7036115.081942358054221 -2012250.532005814136937 ,-7036115.247365267015994 -2012253.840463981963694 ,-7036114.420250725001097 -2012259.630265775602311 ,-7036113.593136182986200 -2012262.111609401414171 ,-7036112.104330006986856 -2012264.592953027226031 ,-7036110.946369648911059 -2012266.743450836278498 ,-7036109.126717656850815 -2012268.893948645330966 ,-7036106.645374030806124 -2012271.871560996398330 )))',-1) );
INSERT INTO BLOCKS VALUES('8','4','4',GeometryFromText('MULTIPOLYGON(((-7036225.419022254645824 -2012249.787602726370096 ,-7036199.943894363008440 -2012246.975413283798844 ,-7036198.124242370016873 -2012246.975413283798844 ,-7036197.297127828933299 -2012247.637104917317629 ,-7036194.815784202888608 -2012279.729149144841358 ,-7036195.808321652933955 -2012280.721686595119536 ,-7036221.779718270525336 -2012283.699298946186900 ,-7036223.103101537562907 -2012283.203030221164227 ,-7036223.930216079577804 -2012282.210492770653218 ,-7036226.907828430645168 -2012251.607254718663171 ,-7036226.742405521683395 -2012250.449294359888881 ,-7036225.419022254645824 -2012249.787602726370096 )))',-1) );
INSERT INTO BLOCKS VALUES('9','4','9',GeometryFromText('MULTIPOLYGON(((-7036224.095638987608254 -2012288.827409106306732 ,-7036195.973744560964406 -2012285.684373846976086 ,-7036194.650361293926835 -2012286.015219663735479 ,-7036193.823246751911938 -2012287.173180022509769 ,-7036191.176480217836797 -2012314.137114089913666 ,-7036192.334440576843917 -2012315.129651540191844 ,-7036220.787180819548666 -2012318.272686799755320 ,-7036224.095638987608254 -2012288.827409106306732 )))',-1) );
INSERT INTO BLOCKS VALUES('10','4','8',GeometryFromText('MULTIPOLYGON(((-7036260.984947558492422 -2012292.466713090892881 ,-7036230.381709506735206 -2012289.323677831562236 ,-7036229.058326239697635 -2012289.654523648321629 ,-7036228.396634605713189 -2012290.812484007095918 ,-7036225.749868071638048 -2012317.610995166236535 ,-7036226.080713888630271 -2012319.099801341537386 ,-7036226.907828430645168 -2012319.430647158529609 ,-7036258.007335207425058 -2012322.408259509364143 ,-7036258.669026841409504 -2012322.077413692604750 ,-7036261.646639192476869 -2012293.128404724411666 ,-7036260.984947558492422 -2012292.466713090892881 )))',-1) );
INSERT INTO BLOCKS VALUES('11','4','3',GeometryFromText('MULTIPOLYGON(((-7036263.466291184537113 -2012253.261483802460134 ,-7036234.021013490855694 -2012250.449294359888881 ,-7036233.028476040810347 -2012250.614717268384993 ,-7036232.366784406825900 -2012250.945563085144386 ,-7036232.035938590764999 -2012252.103523443918675 ,-7036229.058326239697635 -2012282.375915679149330 ,-7036229.223749147728086 -2012283.368453129427508 ,-7036230.381709506735206 -2012283.864721854683012 ,-7036260.819524650461972 -2012287.173180022509769 ,-7036261.812062100507319 -2012287.173180022509769 ,-7036265.451366084627807 -2012254.750289977993816 ,-7036264.955097359605134 -2012253.923175436211750 ,-7036263.466291184537113 -2012253.261483802460134 )))',-1) );
INSERT INTO BLOCKS VALUES('12','4','2',GeometryFromText('MULTIPOLYGON(((-7036303.829480832442641 -2012257.727902329061180 ,-7036281.166542382910848 -2012255.411981611512601 ,-7036279.346890390850604 -2012255.908250336768106 ,-7036278.188930031843483 -2012256.735364878783002 ,-7036276.700123856775463 -2012257.893325237557292 ,-7036276.038432222791016 -2012259.051285596098751 ,-7036273.391665688715875 -2012283.864721854683012 ,-7036274.384203138761222 -2012284.857259304961190 ,-7036275.873009314760566 -2012285.518950938479975 ,-7036302.836943381465971 -2012287.834871656028554 ,-7036303.167789198458195 -2012287.834871656028554 ,-7036303.994903740473092 -2012286.511488388758153 ,-7036304.656595374457538 -2012286.180642571998760 ,-7036306.807093183510005 -2012260.374668863369152 ,-7036306.476247366517782 -2012259.216708504594862 ,-7036305.979978641495109 -2012258.555016871076077 ,-7036303.829480832442641 -2012257.727902329061180 )))',-1) );
INSERT INTO BLOCKS VALUES('13','4','1',GeometryFromText('MULTIPOLYGON(((-7036314.747392785735428 -2012258.885862687835470 ,-7036313.754855335690081 -2012259.216708504594862 ,-7036313.258586610667408 -2012259.216708504594862 ,-7036312.596894976682961 -2012260.209245954873040 ,-7036311.769780434668064 -2012261.532629221910611 ,-7036308.957590992562473 -2012286.346065480494872 ,-7036309.453859717585146 -2012288.331140381051227 ,-7036310.942665892653167 -2012288.992832014802843 ,-7036338.568291594274342 -2012291.970444365637377 ,-7036339.395406136289239 -2012291.970444365637377 ,-7036341.711326853372157 -2012293.128404724411666 ,-7036343.530978845432401 -2012294.120942174689844 ,-7036350.478740998543799 -2012293.790096357930452 ,-7036351.471278448589146 -2012293.128404724411666 ,-7036352.463815898634493 -2012292.301290182396770 ,-7036353.787199165672064 -2012291.143329823855311 ,-7036357.095657333731651 -2012263.683127031195909 ,-7036356.433965699747205 -2012263.021435397444293 ,-7036314.747392785735428 -2012258.885862687835470 )))',-1) );
INSERT INTO BLOCKS VALUES('14','4','7',GeometryFromText('MULTIPOLYGON(((-7036274.384203138761222 -2012291.308752732118592 ,-7036272.895396963693202 -2012291.474175640614703 ,-7036272.068282421678305 -2012292.466713090892881 ,-7036268.594401345588267 -2012325.882140585687011 ,-7036269.586938795633614 -2012326.874678035965189 ,-7036298.370524855330586 -2012330.513982020551339 ,-7036299.363062305375934 -2012330.017713295295835 ,-7036299.859331031329930 -2012327.205523852724582 ,-7036303.167789198458195 -2012295.940594166982919 ,-7036302.671520473435521 -2012294.451787991682068 ,-7036301.844405931420624 -2012293.955519266426563 ,-7036274.384203138761222 -2012291.308752732118592 )))',-1) );
INSERT INTO BLOCKS VALUES('15','4','6',GeometryFromText('MULTIPOLYGON(((-7036342.042172670364380 -2012297.760246159275994 ,-7036313.093163701705635 -2012295.113479625200853 ,-7036311.108088801614940 -2012295.444325441960245 ,-7036309.784705534577370 -2012296.436862892238423 ,-7036308.957590992562473 -2012297.429400342516601 ,-7036308.461322267539799 -2012299.083629426546395 ,-7036305.318287007510662 -2012327.205523852724582 ,-7036305.483709916472435 -2012328.694330028258264 ,-7036306.641670274548233 -2012329.686867478536442 ,-7036307.634207725524902 -2012330.183136203791946 ,-7036308.461322267539799 -2012331.010250745806843 ,-7036336.252370876260102 -2012333.822440188378096 ,-7036338.237445777282119 -2012333.491594371618703 ,-7036339.726251952350140 -2012332.664479829603806 ,-7036340.718789403326809 -2012331.837365287588909 ,-7036341.049635220319033 -2012330.183136203791946 ,-7036341.711326853372157 -2012328.528907119762152 ,-7036344.192670479416847 -2012300.737858510343358 ,-7036344.358093387447298 -2012299.249052334809676 ,-7036343.861824662424624 -2012298.587360701290891 ,-7036343.365555937401950 -2012298.256514884531498 ,-7036342.042172670364380 -2012297.760246159275994 )))',-1) );
INSERT INTO BLOCKS VALUES('16','4','12',GeometryFromText('MULTIPOLYGON(((-7036297.708833222277462 -2012335.311246363911778 ,-7036271.737436604686081 -2012332.499056921107695 ,-7036269.917784612625837 -2012332.995325646363199 ,-7036268.925247161649168 -2012334.153286005137488 ,-7036267.932709711603820 -2012335.145823455415666 ,-7036265.947634810581803 -2012357.147070271195844 ,-7036267.105595169588923 -2012358.635876446729526 ,-7036268.098132619634271 -2012360.290105530759320 ,-7036269.586938795633614 -2012361.448065889300779 ,-7036271.737436604686081 -2012361.778911706293002 ,-7036295.227489596232772 -2012364.591101148864254 ,-7036295.889181229285896 -2012364.094832423608750 ,-7036296.881718680262566 -2012362.771449156571180 ,-7036299.032216489315033 -2012337.130898356204852 ,-7036299.032216489315033 -2012335.807515088934451 ,-7036297.708833222277462 -2012335.311246363911778 )))',-1) );
INSERT INTO BLOCKS VALUES('17','4','11',GeometryFromText('MULTIPOLYGON(((-7036305.318287007510662 -2012336.634629630949348 ,-7036304.160326649434865 -2012336.965475447708741 ,-7036303.829480832442641 -2012338.123435806483030 ,-7036301.182714298367500 -2012363.598563698586076 ,-7036301.678983023390174 -2012364.591101148864254 ,-7036302.175251748412848 -2012365.087369873886928 ,-7036333.936450159177184 -2012369.222942583728582 ,-7036335.425256334245205 -2012368.726673858473077 ,-7036336.252370876260102 -2012368.395828041713685 ,-7036336.914062510244548 -2012367.568713499931619 ,-7036339.064560319297016 -2012345.732889592414722 ,-7036339.064560319297016 -2012343.747814691625535 ,-7036338.237445777282119 -2012341.597316882573068 ,-7036337.079485418274999 -2012340.108510707039386 ,-7036334.432718884199858 -2012338.950550348497927 ,-7036305.318287007510662 -2012336.634629630949348 )))',-1) );
INSERT INTO BLOCKS VALUES('18','3','2',GeometryFromText('MULTIPOLYGON(((-7036431.039697383530438 -2012341.101048157550395 ,-7036500.848164724186063 -2012349.703039393760264 ,-7036507.795926876366138 -2012281.217955320375040 ,-7036507.465081059373915 -2012280.225417870096862 ,-7036505.149160342290998 -2012278.902034602826461 ,-7036502.833239624276757 -2012278.240342969307676 ,-7036440.965071886777878 -2012271.954272450646386 ,-7036438.979996985755861 -2012271.954272450646386 ,-7036438.649151169694960 -2012273.277655717683956 ,-7036431.039697383530438 -2012341.101048157550395 )))',-1) );
INSERT INTO BLOCKS VALUES('19','3','5',GeometryFromText('MULTIPOLYGON(((-7036430.708851566538215 -2012348.379656126722693 ,-7036421.445168696343899 -2012429.106035420903936 ,-7036422.437706147320569 -2012431.752801954979077 ,-7036423.761089414358139 -2012432.414493588497862 ,-7036426.738701765425503 -2012433.407031039008871 ,-7036488.276023685932159 -2012437.377180840354413 ,-7036490.261098586954176 -2012436.384643389843404 ,-7036491.584481853991747 -2012435.722951756324619 ,-7036492.246173487976193 -2012434.068722672527656 ,-7036500.517318907193840 -2012356.981647362932563 ,-7036430.708851566538215 -2012348.379656126722693 )))',-1) );
INSERT INTO BLOCKS VALUES('20','3','6',GeometryFromText('MULTIPOLYGON(((-7036549.151653973385692 -2012363.267717881593853 ,-7036512.758614127524197 -2012359.297568080248311 ,-7036511.766076677478850 -2012359.297568080248311 ,-7036510.773539227433503 -2012359.959259713999927 ,-7036502.171547991223633 -2012433.076185222249478 ,-7036503.164085441268981 -2012434.068722672527656 ,-7036504.156622891314328 -2012435.392105939565226 ,-7036505.810851975344121 -2012436.053797573084012 ,-7036508.457618509419262 -2012436.715489206835628 ,-7036544.850658355280757 -2012439.362255740910769 ,-7036552.129266324453056 -2012365.583638599142432 ,-7036551.467574691399932 -2012363.598563698586076 ,-7036551.467574691399932 -2012363.598563698586076 ,-7036549.151653973385692 -2012363.267717881593853 )))',-1) );
INSERT INTO BLOCKS VALUES('21','3','4',GeometryFromText('MULTIPOLYGON(((-7036601.425293024629354 -2012368.892096766969189 ,-7036561.392949194647372 -2012364.260255332104862 ,-7036559.077028476633132 -2012364.921946965623647 ,-7036558.084491026587784 -2012366.245330232661217 ,-7036558.084491026587784 -2012367.568713499931619 ,-7036550.144191424362361 -2012435.061260122805834 ,-7036550.805883057415485 -2012436.384643389843404 ,-7036551.798420507460833 -2012438.369718290632591 ,-7036552.460112141445279 -2012439.031409924151376 ,-7036604.072059558704495 -2012442.339868091978133 ,-7036604.402905375696719 -2012438.038872473873198 ,-7036600.101909757591784 -2012432.083647771738470 ,-7036601.425293024629354 -2012368.892096766969189 )))',-1) );
INSERT INTO BLOCKS VALUES('22','3','3',GeometryFromText('MULTIPOLYGON(((-7036608.373055176809430 -2012290.150792373344302 ,-7036522.022296997718513 -2012280.556263686856255 ,-7036520.368067913688719 -2012280.556263686856255 ,-7036518.713838829658926 -2012281.217955320375040 ,-7036518.713838829658926 -2012282.872184404404834 ,-7036510.773539227433503 -2012350.364731027279049 ,-7036511.766076677478850 -2012352.349805928068236 ,-7036512.758614127524197 -2012353.011497561587021 ,-7036514.743689028546214 -2012353.673189195105806 ,-7036601.094447207637131 -2012364.260255332104862 ,-7036603.079522108659148 -2012305.700545761967078 ,-7036608.703900993801653 -2012299.414475243305787 ,-7036608.373055176809430 -2012290.150792373344302 )))',-1) );
INSERT INTO BLOCKS VALUES('23','2','2',GeometryFromText('MULTIPOLYGON(((-7036655.684006975963712 -2012284.526413488201797 ,-7036657.338236059993505 -2012269.307505916338414 ,-7036646.420324106700718 -2012267.984122649300843 ,-7036651.383011357858777 -2012221.665708300191909 ,-7036659.323310961015522 -2012222.658245750470087 ,-7036660.315848411060870 -2012208.101029812125489 ,-7036542.534737638197839 -2012190.897047339705750 ,-7036541.873046004213393 -2012194.867197141051292 ,-7036526.323292615823448 -2012194.536351324291900 ,-7036525.992446798831224 -2012198.837346942396834 ,-7036521.029759546741843 -2012200.822421842953190 ,-7036514.081997394561768 -2012270.630889183375984 ,-7036655.684006975963712 -2012284.526413488201797 )))',-1) );
INSERT INTO BLOCKS VALUES('24','2','1',GeometryFromText('MULTIPOLYGON(((-7036441.295917703770101 -2012261.698052130406722 ,-7036506.141697792336345 -2012269.307505916338414 ,-7036508.457618509419262 -2012268.645814282819629 ,-7036509.119310143403709 -2012267.653276832541451 ,-7036509.450155959464610 -2012266.660739382030442 ,-7036516.397918112576008 -2012198.175655308878049 ,-7036513.420305761508644 -2012198.175655308878049 ,-7036514.743689028546214 -2012193.212968057021499 ,-7036519.044684646651149 -2012192.882122240262106 ,-7036519.375530463643372 -2012197.183117858367041 ,-7036523.676526081748307 -2012196.852272041607648 ,-7036524.007371897809207 -2012193.543813873780891 ,-7036540.549662737175822 -2012193.874659690540284 ,-7036540.880508554168046 -2012189.904509889194742 ,-7036660.646694228053093 -2012207.770183995366096 ,-7036660.315848411060870 -2012196.852272041607648 ,-7036657.669081876985729 -2012188.911972438916564 ,-7036653.698932075873017 -2012183.287593553774059 ,-7036647.412861556746066 -2012177.332368851639330 ,-7036638.810870320536196 -2012172.700527416775003 ,-7036628.223804183304310 -2012168.730377615429461 ,-7036620.614350398071110 -2012166.414456897880882 ,-7036614.989971512928605 -2012165.091073630843312 ,-7036610.027284260839224 -2012164.098536180565134 ,-7036604.733751192688942 -2012162.775152913294733 ,-7036598.778526490554214 -2012161.782615463016555 ,-7036542.203891821205616 -2012152.849778410047293 ,-7036450.559600573033094 -2012151.195549326017499 ,-7036441.295917703770101 -2012261.698052130406722 )))',-1) );
INSERT INTO BLOCKS VALUES('25','1','10',GeometryFromText('MULTIPOLYGON(((-7036423.761089415289462 -2012149.872166059212759 ,-7036419.129247980192304 -2012183.618439370766282 ,-7036419.129247980192304 -2012185.272668454563245 ,-7036440.965071887709200 -2012188.250280805630609 ,-7036445.927759139798582 -2012149.872166059212759 ,-7036423.761089415289462 -2012149.872166059212759 )))',-1) );
INSERT INTO BLOCKS VALUES('26','1','11',GeometryFromText('MULTIPOLYGON(((-7036416.482481446117163 -2012149.872166059212759 ,-7036285.467538001947105 -2012146.563707891386002 ,-7036283.813308917917311 -2012148.217936975415796 ,-7036283.482463100925088 -2012155.165699127595872 ,-7036286.129229635000229 -2012155.165699127595872 ,-7036284.805846367962658 -2012171.707989966729656 ,-7036332.116798167116940 -2012176.008985584834591 ,-7036335.425256335176528 -2012150.203011875972152 ,-7036340.057097770273685 -2012149.872166059212759 ,-7036336.417793786153197 -2012173.693064867286012 ,-7036412.181485828012228 -2012184.610976821044460 ,-7036413.504869095049798 -2012184.610976821044460 ,-7036414.828252362087369 -2012183.618439370766282 ,-7036414.828252362087369 -2012181.633364469977096 ,-7036417.805864713154733 -2012155.496544944588095 ,-7036416.482481446117163 -2012154.173161677317694 ,-7036416.151635629124939 -2012154.173161677317694 ,-7036416.482481446117163 -2012149.872166059212759 )))',-1) );
INSERT INTO BLOCKS VALUES('27','1','13',GeometryFromText('MULTIPOLYGON(((-7036266.609326445497572 -2012145.902016257867217 ,-7036207.387925242073834 -2012144.909478807589039 ,-7036207.057079425081611 -2012144.909478807589039 ,-7036203.417775440029800 -2012189.573664072668180 ,-7036204.079467074014246 -2012190.897047339938581 ,-7036205.402850341051817 -2012192.220430606976151 ,-7036261.646639193408191 -2012193.543813874013722 ,-7036262.639176643453538 -2012150.533857692731544 ,-7036265.285943178460002 -2012150.203011875972152 ,-7036266.609326445497572 -2012145.902016257867217 )))',-1) );
INSERT INTO BLOCKS VALUES('28','1','14',GeometryFromText('MULTIPOLYGON(((-7036202.756083806976676 -2012145.240324624348432 ,-7036071.079448728822172 -2012140.939329006243497 ,-7036068.432682194747031 -2012140.939329006243497 ,-7036067.109298926778138 -2012142.593558090040460 ,-7036066.447607293725014 -2012145.571170441107824 ,-7036066.447607293725014 -2012146.563707891386002 ,-7036079.681439965032041 -2012224.643320651259273 ,-7036084.974973033182323 -2012224.974166468251497 ,-7036085.967510483227670 -2012226.297549735289067 ,-7036087.290893751196563 -2012225.966703918529674 ,-7036090.268506102263927 -2012225.635858101770282 ,-7036091.261043552309275 -2012224.312474834499881 ,-7036091.591889369301498 -2012221.665708300424740 ,-7036096.223730803467333 -2012184.280131004285067 ,-7036101.186418055556715 -2012184.280131004285067 ,-7036097.877959887497127 -2012222.327399933943525 ,-7036098.208805704489350 -2012224.312474834499881 ,-7036099.532188971526921 -2012225.635858101770282 ,-7036100.193880605511367 -2012225.966703918529674 ,-7036183.567026433534920 -2012234.568695154739544 ,-7036185.221255517564714 -2012233.907003521220759 ,-7036186.213792967610061 -2012232.583620254183188 ,-7036190.183942769654095 -2012187.588589172111824 ,-7036194.154092570766807 -2012187.588589172111824 ,-7036196.139167470857501 -2012187.588589172111824 ,-7036197.462550737895072 -2012186.926897538593039 ,-7036198.124242371879518 -2012185.603514271322638 ,-7036199.116779821924865 -2012184.610976821044460 ,-7036199.116779821924865 -2012184.610976821044460 ,-7036202.756083806976676 -2012145.240324624348432 )))',-1) );
INSERT INTO BLOCKS VALUES('29','1','6',GeometryFromText('MULTIPOLYGON(((-7036229.554594965651631 -2012197.513963675359264 ,-7036206.064541975036263 -2012196.521426225081086 ,-7036204.079467074014246 -2012197.183117858599871 ,-7036202.756083806976676 -2012198.506501125870273 ,-7036202.425237989984453 -2012199.829884392907843 ,-7036199.116779821924865 -2012232.252774437190965 ,-7036200.771008905954659 -2012234.237849337980151 ,-7036201.432700539939106 -2012235.561232605017722 ,-7036202.094392172992229 -2012235.561232605017722 ,-7036203.748621257022023 -2012236.553770055528730 ,-7036224.922753531485796 -2012238.869690772844478 ,-7036226.576982614584267 -2012238.869690772844478 ,-7036227.900365881621838 -2012238.538844956085086 ,-7036230.877978232689202 -2012199.168192759389058 ,-7036229.554594965651631 -2012197.513963675359264 )))',-1) );
INSERT INTO BLOCKS VALUES('30','1','5',GeometryFromText('MULTIPOLYGON(((-7036269.586938796564937 -2012199.168192759389058 ,-7036239.810815285891294 -2012198.175655309110880 ,-7036238.487432018853724 -2012198.175655309110880 ,-7036237.164048751816154 -2012199.168192759389058 ,-7036236.171511301770806 -2012200.491576026426628 ,-7036232.532207316718996 -2012239.200536589603871 ,-7036233.524744767695665 -2012239.531382406363264 ,-7036265.947634811513126 -2012243.170686390949413 ,-7036267.271018078550696 -2012242.839840574190021 ,-7036270.910322063602507 -2012200.160730209667236 ,-7036269.586938796564937 -2012199.168192759389058 )))',-1) );
INSERT INTO BLOCKS VALUES('31','1','1',GeometryFromText('MULTIPOLYGON(((-7036416.151635629124939 -2012214.717946148011833 ,-7036415.820789813064039 -2012215.379637781530619 ,-7036411.850640011020005 -2012258.058748146053404 ,-7036412.512331645004451 -2012258.389593962812796 ,-7036413.504869095049798 -2012259.051285596331581 ,-7036432.032234834507108 -2012260.705514680361375 ,-7036433.024772285483778 -2012260.374668863601983 ,-7036434.679001369513571 -2012257.727902329294011 ,-7036438.979996987618506 -2012217.364712682319805 ,-7036437.656613720580935 -2012216.372175231808797 ,-7036416.151635629124939 -2012214.717946148011833 )))',-1) );
INSERT INTO BLOCKS VALUES('32','1','2',GeometryFromText('MULTIPOLYGON(((-7036411.519794194959104 -2012214.387100331252441 ,-7036385.052128852345049 -2012211.409487980185077 ,-7036383.397899768315256 -2012212.071179613703862 ,-7036379.758595784194767 -2012254.750289978226647 ,-7036405.233723675832152 -2012258.389593962812796 ,-7036406.226261125877500 -2012258.058748146053404 ,-7036407.218798576854169 -2012256.735364879015833 ,-7036411.519794194959104 -2012214.387100331252441 )))',-1) );
INSERT INTO BLOCKS VALUES('33','1','3',GeometryFromText('MULTIPOLYGON(((-7036377.773520883172750 -2012223.650783200981095 ,-7036376.780983433127403 -2012222.327399933943525 ,-7036332.778489801101387 -2012217.695558499079198 ,-7036330.131723267026246 -2012250.118448543362319 ,-7036374.465062715113163 -2012254.088598344707862 ,-7036377.773520883172750 -2012223.650783200981095 )))',-1) );
INSERT INTO BLOCKS VALUES('34','1','4',GeometryFromText('MULTIPOLYGON(((-7036281.166542383842170 -2012212.732871247222647 ,-7036280.174004932865500 -2012215.048791964771226 ,-7036277.196392581798136 -2012243.170686390949413 ,-7036278.850621665827930 -2012244.824915474979207 ,-7036328.808339999988675 -2012249.787602726602927 ,-7036331.124260717071593 -2012217.364712682319805 ,-7036281.166542383842170 -2012212.732871247222647 )))',-1) );
INSERT INTO BLOCKS VALUES('35','1','7',GeometryFromText('MULTIPOLYGON(((-7036441.626763521693647 -2012192.882122240494937 ,-7036419.460093797184527 -2012190.897047339938581 ,-7036418.798402164131403 -2012192.551276423735544 ,-7036417.475018897093832 -2012205.785109095042571 ,-7036417.805864713154733 -2012207.439338178839535 ,-7036418.798402164131403 -2012209.755258896388113 ,-7036437.325767903588712 -2012211.078642163425684 ,-7036438.649151170626283 -2012211.078642163425684 ,-7036439.972534437663853 -2012207.770183995598927 ,-7036441.626763521693647 -2012192.882122240494937 )))',-1) );
INSERT INTO BLOCKS VALUES('36','1','8',GeometryFromText('MULTIPOLYGON(((-7036413.504869095049798 -2012189.904509889427572 ,-7036411.850640011020005 -2012188.911972439149395 ,-7036411.850640011020005 -2012188.911972439149395 ,-7036388.029741203412414 -2012185.934360088082030 ,-7036386.044666302390397 -2012185.603514271322638 ,-7036386.044666302390397 -2012186.926897538593039 ,-7036384.721283035352826 -2012203.138342560734600 ,-7036384.721283035352826 -2012204.792571644531563 ,-7036386.706357936374843 -2012206.115954911801964 ,-7036409.865565110929310 -2012209.093567262636498 ,-7036411.850640011020005 -2012208.101029812358320 ,-7036412.181485828012228 -2012206.777646545320749 ,-7036413.504869095049798 -2012189.904509889427572 )))',-1) );