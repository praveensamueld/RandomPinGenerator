# Random PIN Generator 
A java library for generating a batch of unique random PINs.

## Prerequisites
1. A Linux/macOS/Windows machine running Java 8 or above. For detailed installation instructions please [click here](https://java.com/en/download/help/download_options.html). 
2. Install **git**. For detailed installation instructions please [click here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
3. An **IDE** - [Intellij IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/).

## Project structure

1. This Java library project was generated using *gradle init* task.
2. This project uses **testNG** for unit testing and **AssertJ** to leverage the rich set of assertions to improve code readability. 

```$xslt
├── gradle 
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew 
├── gradlew.bat 
├── settings.gradle 
└── lib
    ├── build.gradle 
    └── src
        ├── main
        │   └── java 
        │       └── org.westpac.random.pins
        │           └── RandomPinGeneration.java
        │           └── RandomPinGenerator.java
        └── test
            └── java 
                └── org.westpac.random.pins
                    └── RandomPinGeneratorTest.java
```

## Cloning the project
1. Open **Terminal** for **Linux/macOS** or **CMD** for **Windows**.
2. **cd** into the desired folder where you intend to clone the repository.
3. Run the below command. 
```$xslt
git clone https://github.com/davidmerfield/randomColor.git
```
4. **cd** into the parent directory.
```$xslt
cd RandomPinGenerator
```

## Building the project
### Linux/macOS
1. From the parent directory of the cloned repository, run the below command in Terminal.
```$xslt
./gradlew build
```

### Windows
1. From the parent directory of the cloned repository, run the below command in CMD.
```$xslt
gradlew.bat build
```

> Note that you don't need to install gradle on your machine. The first time you run the wrapper script, gradlew, there may be a delay while that version of gradle is downloaded and stored locally in your ~/.gradle/wrapper/dists folder.

> The first time you run the build, Gradle will check whether you already have the required dependencies in your cache under your ~/.gradle directory. If not, the libraries will be downloaded and stored there. The next time you run the build, the cached versions will be used. 

**The gradlew build command performs the below tasks:**
1. Compiles the classes.
2. Generates the jar or library file.
3. Generates the javadoc.
4. Runs the unit tests and generates a test report.

### Build Artifacts
#### Accessing the jar/library
You can find your newly packaged JAR file in the **lib/build/libs** directory with the name **lib-0.1.0.jar**.

#### Accessing the javadoc
You can view the generated javadoc files by opening the HTML file located at **lib/build/docs/javadoc/index.html**.

#### Accessing the unit test results
You can view the test report by opening the HTML output file, located at **lib/build/reports/tests/test/index.html**.

## Using the library or jar file
Lets assume you're using IntelliJ IDEA. 
### Create a java project (This step can be skipped if you already have a java project created)
1. For detailed instructions on how to create a new java project, please [click here](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#create-project)

### Import the library or jar file
1. From the main menu, select **File | Project Structure | Project Settings | Modules**.

2. Select the module for which you want to add a library and click **Dependencies**.

3. Click the **Add** button (Plus symbol) and select **JARs or directories..**

4. Navigate to **RandomPinGenerator/lib/build/libs/lib-0.1.0.jar**

5. Select the jar file and click the **Apply** and **OK** button.

### Consuming the methods in the library
1. Use the below import statement in the Java class file to access the methods in the library
```$xslt
import org.westpac.random.pins.RandomPinGeneration;
import org.westpac.random.pins.RandomPinGenerator;
```

#### Method usage
This library has two methods.

##### Method 1
This method returns 1000 4-digit random unique pins of range 1000 to 9999.

**Usage**
```$xslt
generateBatchOfUniqueRandomPins();
```

###### Example
```$xslt
import org.westpac.random.pins.RandomPinGeneration;
import org.westpac.random.pins.RandomPinGenerator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        RandomPinGeneration randomPinGeneration = new RandomPinGenerator();
        Set<Integer> randomPins = randomPinGeneration.generateBatchOfUniqueRandomPins();
        System.out.println(randomPins);
    }
}
```
###### Output
```$xslt
[4097, 2058, 2059, 6158, 2065, 6164, 2071, 8215, 6171, 4123, 6174, 4127, 6177, 8226, 8227, 6180, 4133, 6182, 6185, 6189, 6190, 8240, 2100, 6197, 2102, 6199, 2104, 6201, 8249, 6202, 8250, 6203, 2109, 2113, 8260, 8261, 8264, 2121, 4172, 2130, 6226, 4181, 2136, 2145, 4194, 4195, 6246, 6248, 2155, 6253, 4205, 6260, 4213, 4214, 2168, 2169, 8315, 6269, 2174, 8321, 6275, 6277, 2182, 8331, 4240, 6294, 4247, 8345, 6297, 2203, 6301, 8352, 4260, 8357, 2213, 2214, 8360, 2221, 8365, 6317, 4270, 2223, 6319, 4274, 8373, 6326, 8378, 8379, 8381, 2238, 6335, 2239, 6338, 2244, 2248, 2252, 2253, 8405, 6365, 4322, 8419, 6375, 6377, 2284, 8431, 4336, 8433, 6387, 2291, 8439, 6392, 8441, 2297, 8443, 2304, 4353, 2306, 8451, 4356, 4357, 6405, 8460, 6412, 6413, 2318, 4366, 8463, 4371, 2324, 6421, 8470, 2327, 4375, 4376, 6424, 4380, 8479, 6432, 6433, 8482, 6434, 6435, 2339, 4389, 6443, 4396, 2349, 2350, 2353, 8498, 6456, 2360, 4411, 6463, 4416, 8513, 6468, 4424, 6474, 2379, 4428, 2381, 2382, 2383, 2384, 4433, 4437, 4438, 4441, 8543, 6495, 4449, 6502, 2406, 2408, 8553, 6506, 2411, 8556, 6512, 8562, 6516, 8565, 4469, 2424, 6525, 6528, 8576, 8579, 4483, 2437, 6536, 8585, 6538, 2442, 6541, 8589, 4495, 4496, 2449, 6549, 4504, 2456, 8601, 2460, 4511, 2470, 6570, 6574, 4528, 4529, 8627, 4531, 4532, 2486, 8634, 2493, 6590, 2494, 8642, 6596, 6597, 6598, 6606, 4561, 6610, 8660, 6613, 8661, 2518, 6614, 2526, 6623, 4579, 6627, 2532, 6629, 4582, 2537, 6636, 4592, 2545, 4595, 4597, 6647, 6651, 2555, 4603, 2556, 2558, 6656, 2561, 6659, 4612, 2569, 8715, 8718, 8723, 4629, 2582, 2586, 6683, 8732, 6686, 4646, 4648, 4653, 6705, 2609, 6710, 2622, 4674, 6724, 4687, 8785, 2642, 4692, 6743, 4696, 8792, 8793, 2655, 6751, 4708, 6759, 4712, 8809, 4716, 4718, 2672, 4723, 4727, 8824, 4729, 4731, 2683, 2687, 4736, 6787, 2691, 2694, 8839, 2696, 6793, 4749, 8846, 8852, 6807, 4762, 8860, 6815, 4771, 4772, 2724, 6822, 4778, 2730, 2731, 6827, 2735, 8881, 4787, 2745, 4797, 8894, 6847, 8898, 2756, 2757, 6854, 6857, 2763, 6861, 4820, 2772, 2774, 2775, 8921, 4831, 2786, 4838, 8937, 4845, 8944, 6896, 2803, 2808, 2810, 8955, 8959, 8964, 2820, 8968, 4874, 2827, 4875, 6924, 4876, 2832, 8978, 8982, 4886, 4891, 6940, 4893, 4895, 2849, 8997, 9004, 9005, 2862, 6958, 2863, 6960, 4912, 4913, 9017, 2874, 9023, 4928, 2882, 6981, 9029, 2901, 4952, 9051, 4955, 4958, 4959, 2912, 9057, 4963, 4965, 9072, 9073, 2930, 4982, 7031, 2935, 9080, 4985, 7036, 7039, 9088, 4993, 9090, 9095, 9097, 9100, 5009, 9107, 7064, 9114, 5018, 9116, 2973, 9120, 5027, 5032, 2987, 7085, 5038, 2990, 9136, 5041, 9137, 2995, 7096, 5050, 5053, 3015, 7112, 5065, 7121, 9180, 9181, 9184, 7142, 5095, 7143, 7145, 3053, 9198, 9200, 5108, 7157, 9205, 5111, 7162, 5115, 1020, 7164, 5127, 9223, 3084, 5133, 3085, 7183, 7184, 5140, 1045, 5143, 9240, 5148, 9246, 5151, 9248, 9250, 1062, 9255, 3112, 9257, 3114, 9262, 3122, 9266, 1076, 1077, 5177, 5178, 9274, 5184, 9281, 1089, 7236, 3140, 3141, 9285, 5191, 7239, 3148, 5197, 9294, 9295, 3152, 1109, 7255, 9306, 1114, 3163, 7263, 3168, 7267, 3172, 5221, 9317, 5222, 1126, 9318, 3176, 1129, 5228, 5230, 3182, 1138, 9333, 7285, 9334, 5242, 5245, 7301, 5259, 9355, 9356, 1167, 7311, 1175, 1176, 5272, 7320, 9369, 1182, 9378, 1188, 1190, 1191, 7336, 5290, 7341, 9390, 7343, 9391, 3248, 3250, 7348, 7350, 9398, 9399, 1210, 1211, 1212, 3264, 9408, 5312, 1218, 7362, 3268, 7367, 9416, 7371, 9420, 7373, 3278, 9425, 9426, 7378, 3284, 5336, 9436, 7388, 5344, 7397, 1256, 5353, 7402, 3310, 9454, 1264, 7410, 5363, 1268, 7413, 7414, 9464, 9465, 1273, 1275, 3325, 9470, 5375, 5377, 5378, 1283, 9475, 9476, 1288, 5387, 1292, 7441, 5397, 5400, 9497, 3354, 1308, 9502, 3358, 3359, 3360, 9506, 9507, 9512, 1320, 9515, 3372, 9516, 5421, 5426, 7474, 5428, 1333, 9528, 5433, 9530, 7484, 5437, 7488, 7489, 3395, 3397, 1352, 3401, 9546, 5450, 9547, 3406, 7502, 1358, 1359, 5456, 3408, 1362, 7508, 3414, 5463, 7513, 3419, 7515, 5470, 9569, 9570, 1380, 3429, 5478, 1385, 9577, 3438, 5486, 9584, 3440, 3442, 9589, 7544, 5496, 9592, 1401, 9599, 3455, 3460, 9613, 5518, 3473, 1429, 5525, 7573, 9621, 1431, 7576, 1433, 7580, 9628, 7582, 3487, 1439, 5536, 3489, 5538, 3491, 9635, 5541, 1448, 9641, 3501, 7599, 3504, 7601, 1457, 1458, 3508, 7607, 3514, 3516, 5564, 7612, 5568, 1472, 1476, 1479, 5578, 5580, 9676, 1488, 9685, 5593, 1503, 5603, 9699, 5604, 9701, 3558, 3559, 3560, 3561, 5614, 1519, 1520, 1521, 1523, 3572, 7669, 3578, 3579, 5629, 3595, 9743, 5647, 3602, 5650, 7700, 1557, 9750, 9753, 1565, 3614, 9758, 7715, 1573, 5675, 9771, 1580, 9777, 5681, 7731, 5684, 9781, 5687, 3640, 5688, 9784, 5689, 3642, 7741, 7744, 5697, 9796, 1604, 5703, 7754, 3660, 5709, 9806, 9807, 7761, 5713, 3669, 5721, 5722, 9818, 9819, 7774, 9822, 9825, 7778, 3687, 7786, 3691, 9839, 1648, 5746, 9844, 7797, 3704, 5754, 3709, 5758, 1663, 7808, 3714, 5763, 5765, 1672, 1675, 3729, 3731, 1683, 1687, 9881, 9884, 5789, 1696, 1697, 3746, 1700, 7846, 3751, 1707, 5805, 9902, 7855, 5809, 9909, 5815, 3769, 1724, 1727, 7875, 5828, 9925, 9927, 3783, 7881, 9931, 7884, 7892, 9941, 7894, 3799, 1754, 7898, 1756, 1758, 9955, 7907, 9960, 1768, 3817, 7913, 5865, 1771, 5868, 9965, 5873, 7922, 7928, 5880, 9977, 9978, 7931, 7933, 7934, 1794, 5891, 5892, 1801, 3852, 5904, 7953, 3857, 3859, 5910, 7959, 3865, 1820, 1822, 5919, 3871, 5920, 3873, 5925, 5928, 1834, 5930, 5931, 7980, 1838, 1839, 5935, 3888, 1844, 7989, 7990, 3895, 1848, 5944, 7994, 1850, 3899, 5947, 7995, 1854, 3902, 5951, 8002, 8007, 8008, 5963, 5964, 5965, 1869, 5966, 1872, 5969, 8020, 8024, 1881, 8026, 5978, 8030, 1886, 5984, 3937, 8033, 3939, 8035, 5990, 3951, 3952, 8049, 6003, 6005, 8054, 8055, 6008, 1916, 1918, 6014, 1919, 6017, 1925, 6021, 8070, 3980, 1933, 6030, 1941, 1945, 8091, 1948, 3996, 3998, 1955, 6052, 8102, 4009, 1962, 6059, 8108, 6060, 4012, 6063, 6064, 6066, 4018, 1971, 6068, 1973, 4022, 6074, 1980, 1981, 1983, 1984, 8130, 6082, 1987, 1990, 8136, 6096, 6099, 2004, 4054, 4056, 4057, 6105, 4059, 6109, 6114, 2019, 4067, 8165, 2022, 8175, 2031, 4082, 8179, 2036, 2040, 2041, 4092, 2045, 6143]
```