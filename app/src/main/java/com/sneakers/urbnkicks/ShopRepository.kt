package com.sneakers.urbnkicks

class ShopRepository {

    fun getNewArrivals(): List<ItemListing> {
        return listOf(
            ItemListing("Nike", "Dunk Low Team Red","none", 7899.00, 11800.00, "https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/8cbb6c3e-bf4a-43a0-96f7-18a10d722f02/custom-nike-dunk-low-by-you-su24.png", "unisex", "casual", "none", "none"),
            ItemListing("Nike", "Downshifter 13", "none", 4295.00, 7799.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/89963238-7a6a-48cc-a2fe-4e95dd03fd89/downshifter-13-road-running-shoes-4Gw85J.png", "men", "running", "none", "none"),
            ItemListing("Nike", "Ember Glow Unisex Shoes", "none", 8725.00, 9000.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/444becef-65fe-4662-98eb-fb048d3ad507/ja-1-fuel-ep-basketball-shoes-XncH16.png", "unisex", "sports", "none", "none"),

            ItemListing("Reebok", "Run Bolt ZR", "none", 3999.00, 4999.00,
                "https://imagescdn.reebok.in/img/app/product/9/991537-13311649.jpg?auto=format&w=390",
                "unisex", "casual", "none", "none"),

            ItemListing("Puma", "Scorch Runner V2", "none", 2299.00, 4999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/379988/03/sv01/fnd/IND/fmt/png/Scorch-Runner-V2-Men's-Shoes",
                "unisex", "running", "none", "none"),

            ItemListing("Puma", "ForeverRun NITRO™ Sunset Shoes", "none", 7799.00, 8999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_2000,h_2000/global/380007/01/sv01/fnd/AUS/fmt/png/ForeverRun-NITRO%E2%84%A2-Sunset-Men's-Running-Shoes",
                "unisex", "casual", "none", "none"),

            ItemListing("Adidas", "X-PLR Path Shoes", "none", 3699.00, 4999.00,
                "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/fb2fec9371514fba99152229c4c7d279_9366/X_PLR_Path_Shoes_Red_IG8137_06_standard.jpg",
                "women", "casual", "none", "none"),


        )
    }

    fun getPopularShoes(): List<ItemListing> {
        return listOf(
            ItemListing("Nike", "Pegasus 31 Men's Running Shoes", "none", 3499.00, 4600.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/0558cdb5-4d42-4f4d-9b37-5038f1f97f9f/pegasus-41-road-running-shoes-RZm89S.png", "men", "running", "none", "none"),
            ItemListing("Nike", "Courtvision Low", "none", 3000.00, 4000.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/cf43fd2a-f2c3-4d7e-ae24-65bd6e0c41c1/court-vision-low-shoes-ZwjLXN.png", "unisex", "sports", "none", "none"),

            ItemListing("Reebok", "Ree-Fresh Classic Shoes", "none", 2799.00, 3999.00,
                "https://imagescdn.reebok.in/img/app/product/3/39662700-13497324.jpg?auto=format&w=390",
                "women", "casual", "none", "none"),

            ItemListing("Puma", "X-Cell Lightspeed Men's Running Shoes", "none", 4399.00, 4999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/309972/01/sv01/fnd/IND/fmt/png/X-Cell-Lightspeed-Men's-Running-Shoes",
                "men", "running", "none", "none"),

            ItemListing("Adidas", "Stan Smith Shoes", "none", 5399.00, 6900.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/b47d77eba6f945ea8dabac210127b11e_9366/Stan_Smith_Shoes_White_FX5501_01_standard.jpg", "men", "none", "none", "none"),

            ItemListing("Adidas", "CloudFoam Move Lounger Shoes", "none", 4899.00, 5999.00,
                "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/5ee89be58e27428fb20ebbe1f7fe7aa2_9366/Cloudfoam_Move_Lounger_Shoes_Grey_ID6514_01_standard.jpg",
                "women", "casual", "none", "none"),

            ItemListing("Adidas", "StrideRunner Lounger Shoes", "none", 4899.00, 5999.00,
                "https://imagescdn.reebok.in/img/app/product/8/802129-9482166.jpg?auto=format&w=390",
                "unisex", "casual", "none", "none"),

        )
    }

    fun getSale(): List<ItemListing> {
        return mutableListOf(

            ItemListing("Nike", "Dunk Low Team Red","none", 7899.00, 11800.00, "https://static.nike.com/a/images/t_PDP_864_v1/f_auto,b_rgb:f5f5f5/8cbb6c3e-bf4a-43a0-96f7-18a10d722f02/custom-nike-dunk-low-by-you-su24.png", "unisex", "casual", "NEW_ARRIVALS", "NO_TAG"),
            ItemListing("Nike", "Downshifter 13", "none", 4295.00, 7799.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/89963238-7a6a-48cc-a2fe-4e95dd03fd89/downshifter-13-road-running-shoes-4Gw85J.png", "men", "running", "NEW_ARRIVALS", "NO_TAG"),
            ItemListing("Nike", "Ember Glow Unisex Shoes", "none", 8725.00, 9000.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/444becef-65fe-4662-98eb-fb048d3ad507/ja-1-fuel-ep-basketball-shoes-XncH16.png", "unisex", "sports", "NEW_ARRIVALS", "NO_TAG"),

            ItemListing("Reebok", "Run Bolt ZR", "none", 3999.00, 4999.00,
                "https://imagescdn.reebok.in/img/app/product/9/991537-13311649.jpg?auto=format&w=390",
                "unisex", "casual", "NEW_ARRIVALS", "NO_TAG"),

            ItemListing("Puma", "Scorch Runner V2", "none", 2299.00, 4999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/379988/03/sv01/fnd/IND/fmt/png/Scorch-Runner-V2-Men's-Shoes",
                "unisex", "running", "NEW_ARRIVALS", "NO_TAG"),

            ItemListing("Puma", "ForeverRun NITRO™ Sunset Shoes", "none", 7799.00, 8999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_2000,h_2000/global/380007/01/sv01/fnd/AUS/fmt/png/ForeverRun-NITRO%E2%84%A2-Sunset-Men's-Running-Shoes",
                "unisex", "casual", "NEW_ARRIVALS", "NO_TAG"),

            ItemListing("Adidas", "X-PLR Path Shoes", "none", 3699.00, 4999.00,
                "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/fb2fec9371514fba99152229c4c7d279_9366/X_PLR_Path_Shoes_Red_IG8137_06_standard.jpg",
                "women", "casual", "NEW_ARRIVALS", "NO_TAG"),

            ItemListing("Nike", "Pegasus 31 Men's Running Shoes", "none", 3499.00, 4600.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/0558cdb5-4d42-4f4d-9b37-5038f1f97f9f/pegasus-41-road-running-shoes-RZm89S.png", "men", "running", "POPULAR", "NO_TAG"),
            ItemListing("Nike", "Courtvision Low", "none", 3000.00, 4000.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/cf43fd2a-f2c3-4d7e-ae24-65bd6e0c41c1/court-vision-low-shoes-ZwjLXN.png", "unisex", "sports", "POPULAR", "NO_TAG"),

            ItemListing("Reebok", "Ree-Fresh Classic Shoes", "none", 2799.00, 3999.00,
                "https://imagescdn.reebok.in/img/app/product/3/39662700-13497324.jpg?auto=format&w=390",
                "women", "casual", "POPULAR", "NO_TAG"),

            ItemListing("Puma", "X-Cell Lightspeed Men's Running Shoes", "none", 4399.00, 4999.00,
                "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/309972/01/sv01/fnd/IND/fmt/png/X-Cell-Lightspeed-Men's-Running-Shoes",
                "men", "running", "POPULAR", "NO_TAG"),

            ItemListing("Adidas", "Stan Smith Shoes", "none", 5399.00, 6900.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/b47d77eba6f945ea8dabac210127b11e_9366/Stan_Smith_Shoes_White_FX5501_01_standard.jpg", "men", "none", "POPULAR", "NO_TAG"),

            ItemListing("Adidas", "CloudFoam Move Lounger Shoes", "none", 4899.00, 5999.00,
                "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/5ee89be58e27428fb20ebbe1f7fe7aa2_9366/Cloudfoam_Move_Lounger_Shoes_Grey_ID6514_01_standard.jpg",
                "women", "casual", "POPULAR", "NO_TAG"),

            ItemListing("Adidas", "StrideRunner Lounger Shoes", "none", 4899.00, 5999.00,
                "https://imagescdn.reebok.in/img/app/product/8/802129-9482166.jpg?auto=format&w=390",
                "unisex", "casual", "POPULAR", "NO_TAG"),

            ItemListing(
                "Nike", "Air Zoom Pegasus 38",
                "The Nike Air Zoom Pegasus 38 continues to put a spring in your step with responsive foam and a breathable mesh upper for comfort and durability.",
                5000.00, 6200.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/9005c997-949f-4c9f-af77-32e82e214d31/air-zoom-pegasus-38-younger-older-road-running-shoes-sdD49r.png", "Men", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Ultraboost 21",
                "The Adidas Ultraboost 21 features Boost cushioning for energy return and a precise fit for long-distance running comfort.",
                9500.00, 11200.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/5a6e38e1838140b9a337fd76ecf04d5c_9366/Ultrabounce_Shoes_White_IE0715_01_standard.jpg", "Women", "Running", "SALE", "NO_TAG"
            ),
            ItemListing(
                "Puma", "RS-X³ Puzzle",
                "The Puma RS-X³ Puzzle combines bold design with RS technology for superior cushioning and comfort in a casual look.",
                4500.00, 5300.00, "https://images.vegnonveg.com/resized/700X573/3052/rs-x3-puzzle-pwhite-dazzling-blue-hi-rise-5e4be04fcae6e.jpeg", "Unisex", "Casual", "SALE", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "Fresh Foam 1080v11",
                "The New Balance Fresh Foam 1080v11 provides ultimate comfort with Hypoknit upper and Fresh Foam midsole for a smooth ride.",
                7000.00, 8300.00, "https://images-static.nykaa.com/media/catalog/product/8/a/8a5e580M1080S11_2.jpg", "Men", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Nano X1",
                "The Reebok Nano X1 is versatile for all fitness activities with a Flexweave knit upper and responsive Floatride Energy Foam.",
                5500.00, 6500.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/b76071d9d7aa41488925a73b8873d845_9366/Dropset_2_Trainer_Orange_IE8049_01_standard.jpg", "Men", "Sports", "SALE", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Go Run Ride 9",
                "The Skechers Go Run Ride 9 is lightweight and responsive with ULTRA GO cushioning and a breathable mesh upper for running comfort.",
                4200.00, 4900.00, "https://img.tatacliq.com/images/i13/437Wx649H/MP000000014744319_437Wx649H_202309150045213.jpeg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Disruptor II",
                "The Fila Disruptor II features a chunky design with leather and synthetic upper, EVA midsole, and durable rubber outsole for casual style and comfort.",
                3500.00, 4100.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/d328b1a46fa7493ea693ff0c55a756da_9366/Adifom_Climacool_Shoes_Beige_IF3904_01_standard.jpg", "Unisex", "Casual", "SALE", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Old Skool",
                "The Vans Old Skool is a classic skate shoe with canvas and suede upper, padded collar, and iconic side stripe for durability and style.",
                3000.00, 3600.00, "https://assets.solesense.com/en/images/products/500/vans-old-skool-color-theory-golden-yellow-vn0a5krsf3x_1.jpg", "Unisex", "Casual", "SALE", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "6-Inch Premium Waterproof Boots",
                "The Timberland 6-Inch Premium Waterproof Boots are rugged and durable with premium leather and seam-sealed construction for outdoor adventures.",
                7500.00, 8900.00, "https://inkostore.be/cdn/shop/products/DSC_3202_1296x.jpg?v=1643813262", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GEL-Nimbus 23",
                "The Asics GEL-Nimbus 23 is a premium neutral running shoe with GEL technology for shock absorption and FlyteFoam Propel technology for a responsive ride.",
                8000.00, 9600.00, "https://m.media-amazon.com/images/I/61+U7UTxJhL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Carnaby Evo",
                "The Lacoste Carnaby Evo is a classic sneaker with a leather upper, OrthoLite insole, and iconic crocodile logo for timeless style and comfort.",
                6000.00, 7200.00, "https://lacoste.com.ph/media/catalog/product/cache/26fe6a6398e2195b866f326b17d6b664/3/9/39sfa0048_407_01.jpg", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Air Force 1 '07",
                "The Nike Air Force 1 '07 is an iconic sneaker with leather upper, Air-Sole unit for cushioning, and rubber outsole for durability and traction.",
                5500.00, 6500.00, "https://images.vegnonveg.com/resized/700X573/11195/air-force-1-07-saillimestone-pale-vanilla-coconut-milk-cream-66508e9ee2809.jpg", "Women", "Casual", "SALE", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "574 Core",
                "The New Balance 574 Core is a classic sneaker with suede and mesh upper, ENCAP midsole for support, and rubber outsole for durability.",
                4500.00, 5400.00, "https://images-static.nykaa.com/media/catalog/product/7/1/710d19aU574KBG_3.jpg", "Unisex", "Casual", "SALE", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Club C 85",
                "The Reebok Club C 85 is a retro tennis shoe with soft leather upper, EVA midsole for lightweight cushioning, and rubber outsole for traction.",
                4800.00, 5800.00, "https://img.tatacliq.com/images/i14/437Wx649H/MP000000020164807_437Wx649H_202311200732111.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Suede Classic",
                "The Puma Suede Classic is an iconic sneaker with suede upper, padded collar, and rubber outsole for traction and durability.",
                4000.00, 4800.00, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/374915/77/sv01/fnd/IND/fmt/png/Suede-Classic-XXI-Unisex-Sneakers", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "D'Lites Fresh Start",
                "The Skechers D'Lites Fresh Start is a sporty sneaker with leather and synthetic upper, Air-Cooled Memory Foam insole, and lightweight midsole for comfort.",
                4200.00, 5000.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/1f041d7c116145b4a266e25093ae45f2_9366/Ozgaia_Shoes_White_IG6047_01_standard.jpg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Memory Workshift",
                "The Fila Memory Workshift is a work shoe with leather and synthetic upper, memory foam sockliner, and slip-resistant rubber outsole for comfort and safety.",
                3800.00, 4500.00, "https://m.media-amazon.com/images/I/51byaXxlb2L._SY695_.jpg", "Men", "Sports", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Sk8-Hi",
                "The Vans Sk8-Hi is a high-top skate shoe with canvas and suede upper, padded collar, and signature waffle outsole for grip and durability.",
                4000.00, 4800.00, "https://www.808skate.com/media/catalog/product/cache/3154772c9615514b1458c51736cabcb9/F/W/FWVANS396_02_zuSckSQYX4n4YJjU.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Davis Square Chukka",
                "The Timberland Davis Square Chukka is a casual sneaker-boot hybrid with canvas and leather upper, OrthoLite footbed, and rubber outsole for comfort and traction.",
                6500.00, 7800.00, "https://apim.marks.com/v1/product/api/v1/product/image/76005911f?baseStoreId=MKS&lang=en_CA&subscription-key=c01ef3612328420c9f5cd9277e815a0e&imwidth=640&impolicy=mZoom", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GT-2000 10",
                "The Asics GT-2000 10 is a stability running shoe with GEL technology for shock absorption and FlyteFoam technology for lightweight cushioning.",
                7000.00, 8400.00, "https://m.media-amazon.com/images/I/51iZnk+LlcL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Lerond",
                "The Lacoste Lerond is a classic sneaker with leather and synthetic upper, OrthoLite insole, and iconic crocodile logo for a timeless look.",
                5500.00, 6600.00, "https://www.lacoste.in/media/catalog/product/4/6/46sma0026_03a_01.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Revolution 5",
                "The Nike Revolution 5 is a lightweight running shoe with mesh upper, soft foam midsole, and durable rubber outsole for traction and support.",
                4500.00, 5500.00, "https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcTpzWjI8J1qOmZdgXIcsr8_GfzkgYCJWp60N-isCFzVSnOVYfnaxKHzHHq2nKsT0f3spKCAPqOIVQTsb8WsOsCP623vhyzI2g", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "NMD_R1",
                "The Adidas NMD_R1 features a knit upper, Boost cushioning for energy return, and rubber outsole for grip and durability.",
                8500.00, 10000.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/0fd9bc2bfc234ce0b69aaef900fddbdf_9366/NMD_R1_Shoes_Black_HQ4452_01_standard.jpg", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "997H",
                "The New Balance 997H is a modern sneaker with suede and mesh upper, ENCAP midsole for support, and rubber outsole for durability and traction.",
                4800.00, 5800.00, "https://img.tatacliq.com/images/i8/1316Wx1468H/MP000000012049951_1316Wx1468H_202202070639013.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Floatride Energy 3",
                "The Reebok Floatride Energy 3 is a lightweight running shoe with Floatride Energy Foam for responsive cushioning and a breathable mesh upper.",
                5200.00, 6300.00, "https://img.tatacliq.com/images/i14/437Wx649H/MP000000020165019_437Wx649H_202311200741071.jpeg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Cali Sport",
                "The Puma Cali Sport is a modern sneaker with leather upper, stacked rubber sole, and metallic branding for a contemporary look.",
                5000.00, 6000.00, "https://img.tatacliq.com/images/i16//437Wx649H/MP000000021236626_437Wx649H_202402181413131.jpeg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Elite Flex Hartnell",
                "The Skechers Elite Flex Hartnell is a sporty sneaker with mesh fabric upper, Air-Cooled Memory Foam insole, and flexible articulated midsole.",
                4200.00, 5100.00, "https://img.tatacliq.com/images/i8/437Wx649H/MP000000014743733_437Wx649H_202210022106021.jpeg", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Axilus 2 Energized",
                "The Fila Axilus 2 Energized is a performance tennis shoe with breathable mesh upper, Energized Rubber midsole, and durable outsole for court-ready comfort and support.",
                4300.00, 5200.00, "https://m.media-amazon.com/images/I/61lNqMYbWvL._SY695_.jpg", "Men", "Sports", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Authentic",
                "The Vans Authentic is a classic skate shoe with canvas upper, metal eyelets, and signature rubber waffle outsole for traction and durability.",
                3000.00, 3600.00, "https://images.vans.com/is/image/Vans/VN000BW5_OLV_HERO?wid=1600&hei=1984&fmt=jpeg&qlt=90&resMode=sharp2&op_usm=0.9,1.7,8,0", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Killington Chukka",
                "The Timberland Killington Chukka is a lightweight boot with breathable mesh upper, OrthoLite footbed, and durable rubber outsole for all-day comfort.",
                6000.00, 7200.00, "https://assets.timberland.eu/images/t_img/f_auto,h_650,w_650/v1701899084/TB0A191I231-HERO/Killington-Chukka-for-Men-in-Yellow.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GEL-Kayano 28",
                "The Asics GEL-Kayano 28 is a premium stability running shoe with GEL technology for shock absorption and FlyteFoam Propel technology for energy return.",
                8500.00, 10200.00, "https://m.media-amazon.com/images/I/61+U7UTxJhL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "L.12.12",
                "The Lacoste L.12.12 is a classic sneaker with leather upper, OrthoLite insole, and iconic crocodile logo for timeless style and comfort.",
                5500.00, 6600.00, "https://akn-lacoste.b-cdn.net/products/2019/02/11/30028/6365f2fc-a523-4c49-a04c-575b6fc4b225_size2000x2000_cropCenter.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Downshifter 11",
                "The Nike Downshifter 11 is a lightweight running shoe with mesh upper, cushioned midsole, and durable rubber outsole for everyday comfort and support.",
                4000.00, 4800.00, "https://m.media-amazon.com/images/I/71dn1S6+9hL._SX695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Superstar Black Sneakers",
                "The Adidas Superstar is an iconic sneaker with leather upper, classic rubber shell toe, and herringbone-pattern rubber cupsole for all-day comfort and style.",
                6000.00, 7200.00, "https://img.tatacliq.com/images/i4/437Wx649H/MP000000006915880_437Wx649H_20200513230213.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "327 Unisex Casual Shoes",
                "The New Balance 327 is a lifestyle sneaker with nylon and suede upper, EVA midsole for lightweight cushioning, and durable rubber outsole for traction.",
                5000.00, 6000.00, "https://images-static.nykaa.com/media/catalog/product/7/1/710d19aMS327LAB_1.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Classic Leather",
                "The Reebok Classic Leather is a timeless sneaker with soft leather upper, Die-cut EVA midsole for lightweight cushioning, and durable rubber outsole for traction.",
                4500.00, 5400.00, "https://images-static.nykaa.com/media/catalog/product/8/a/8af8e00IE9384_3.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Carina",
                "The Puma Carina is a classic sneaker with leather upper, SoftFoam+ sockliner for comfort, and rubber outsole for traction and durability.",
                4000.00, 4800.00, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/395829/02/sv01/fnd/IND/fmt/png/Carina-Slim-Perf-Women's-Sneakers", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Summits",
                "The Skechers Summits is a sporty sneaker with mesh fabric upper, Memory Foam insole, and flexible shock-absorbing midsole for comfort and support.",
                3800.00, 4500.00, "https://www.skechers.in/on/demandware.static/-/Sites-skechers_india/default/dwf9e3bd09/images/large/191665640431-4.jpg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Disruptor III",
                "The Fila Disruptor III features a bold design with leather and synthetic upper, EVA midsole, and durable rubber outsole for casual style and comfort.",
                3500.00, 4200.00, "https://adn-static1.nykaa.com/nykdesignstudio-images/pub/media/catalog/product/d/3/d3dfb24FILA-11010321_4.jpg?rnd=20200526195200&tr=w-1080", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Slip-On",
                "The Vans Slip-On is a classic skate shoe with canvas upper, elastic side accents, and signature rubber waffle outsole for grip and durability.",
                3500.00, 4200.00, "https://adn-static1.nykaa.com/nykdesignstudio-images/pub/media/catalog/product/d/3/d3dfb24FILA-11010321_4.jpg?rnd=20200526195200&tr=w-256", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GEL-Cumulus 23",
                "The Asics GEL-Cumulus 23 is a neutral running shoe with GEL technology for shock absorption and FlyteFoam technology for cushioning and a responsive ride.",
                7500.00, 9000.00, "https://m.media-amazon.com/images/I/61+U7UTxJhL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Graduate",
                "The Lacoste Graduate is a classic sneaker with leather upper, OrthoLite insole, and embroidered crocodile logo for timeless style and comfort.",
                6000.00, 7200.00, "https://lacoste.com.ph/media/catalog/product/cache/26fe6a6398e2195b866f326b17d6b664/7/4/744sma0014_042_01.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Court Royale",
                "The Nike Court Royale is a tennis-inspired sneaker with leather upper, classic design lines, and durable rubber outsole for a heritage look and traction.",
                4200.00, 5100.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/23da5e9b-6bee-47eb-8b1d-259ac3b13cfd/court-royale-2-low-shoe-fjdwrF.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Gazelle",
                "The Adidas Gazelle is an iconic sneaker with suede upper, serrated 3-Stripes, and rubber outsole for a vintage look and all-day comfort.",
                5500.00, 6600.00, "https://img.tatacliq.com/images/i13/437Wx649H/MP000000019117071_437Wx649H_202309081025163.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "515 Core",
                "The New Balance 515 Core is a retro sneaker with suede and mesh upper, EVA midsole for cushioning, and rubber outsole for traction and durability.",
                4000.00, 4800.00, "https://cheels.com/cz/wp-content/uploads/2023/01/m7fb89cb066761d8d6d3f2602f1e68782_470168_z_1.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Speed TR Flexweave",
                "The Reebok Speed TR Flexweave is a training shoe with Flexweave upper, responsive midsole cushioning, and durable rubber outsole for versatile workouts.",
                4800.00, 5800.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/62d1c81953534e5dafcc4a523c2bf8e2_9366/EdgeWalk_Orange_IU6416_06_standard.jpg", "Men", "Sports", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Vikky v2",
                "The Puma Vikky v2 is a classic sneaker with suede and synthetic upper, SoftFoam+ sockliner for cushioning, and rubber outsole for traction and durability.",
                3500.00, 4200.00, "https://img.tatacliq.com/images/i16//437Wx649H/MP000000021236851_437Wx649H_202402181422221.jpeg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Flex Appeal 3.0",
                "The Skechers Flex Appeal 3.0 is a sporty sneaker with soft flat-knit mesh fabric upper, Air-Cooled Memory Foam insole, and lightweight flexible midsole.",
                4000.00, 4800.00, "https://img.tatacliq.com/images/i8/437Wx649H/MP000000014747011_437Wx649H_202210030257021.jpeg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Memory Workshift SR",
                "The Fila Memory Workshift SR is a slip-resistant work shoe with leather and synthetic upper, memory foam sockliner, and durable rubber outsole for comfort and safety.",
                3800.00, 4500.00, "https://m.media-amazon.com/images/I/41lbT3TrWUL._SY695_.jpg", "Men", "Sports", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Era",
                "The Vans Era is a classic skate shoe with canvas upper, metal eyelets, and signature rubber waffle outsole for grip and durability.",
                3000.00, 3600.00, "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRxFH9Eh9DbaqjmvhE9CCA2wMyhp-674Ku1qnq6BtJrRAjXGIo6cm6Sa4ZsWZBo9wbSRWLz1dNbUmWK00KcQOI1K6EuQF8-vRo-EMt0oUB7kcYlrVf_IGtc", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Groveton Chukka",
                "The Timberland Groveton Chukka is a lightweight sneaker-boot hybrid with canvas and leather upper, OrthoLite footbed, and durable rubber outsole for comfort and traction.",
                5000.00, 6000.00, "https://assets.timberland.eu/images/t_img/f_auto,h_650,w_650/v1701899084/TB0A191I231-HERO/Killington-Chukka-for-Men-in-Yellow.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GT-1000 10",
                "The Asics GT-1000 10 is a supportive running shoe with GEL technology for shock absorption and DuoMax system for stability and support.",
                6000.00, 7200.00, "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRrSllxmglSTOK85aukGXrcL6JjhGRCQzeEkjNQz1WxTiSyrbqxCiphuTdAOTDaa1sSKj3cljuaFucXrSgrmvU-81QGUNyP0n2tXLNT6dbMtEVUGJPc45smJkg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Ampthill",
                "The Lacoste Ampthill is a classic mid-top sneaker with leather and synthetic upper, OrthoLite insole, and embroidered crocodile logo for a timeless look.",
                5000.00, 6000.00, "https://imagena1.lacoste.com/dw/image/v2/AAUP_PRD/on/demandware.static/-/Sites-master/default/dweeeb1b8d/39CMA0017_J18_01.jpg?imwidth=915&impolicy=product", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Court Vision Low",
                "The Nike Court Vision Low is a basketball-inspired sneaker with leather upper, autoclave construction for durability, and rubber outsole for traction and grip.",
                4200.00, 5100.00, "https://images.vegnonveg.com/resized/700X573/11120/nike-dunk-low-whiteblack-football-grey-green-strike-white-663cb3502e73e.jpg", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Samba Classic",
                "The Adidas Samba Classic is an indoor soccer-inspired sneaker with leather upper, suede overlay, and non-marking rubber outsole for traction and durability.",
                5000.00, 6000.00, "https://assets.adidas.com/images/h_2000,f_auto,q_auto,fl_lossy,c_fill,g_auto/d5f0eb580a304d2da10b9fa12ae963a4_9366/HEATHER_LOW_SHOES_Grey_IR5038_06_standard.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "880v11",
                "The New Balance 880v11 is a cushioned running shoe with Fresh Foam midsole for a smooth ride and engineered mesh upper for breathability and support.",
                7000.00, 8300.00, "https://images-static.nykaa.com/media/catalog/product/d/c/dce782fM880D11_2.jpg", "Unisex", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Nano X",
                "The Reebok Nano X is a versatile training shoe with Flexweave knit upper, responsive cushioning, and durable rubber outsole for CrossFit and gym workouts.",
                5500.00, 6500.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/b76071d9d7aa41488925a73b8873d845_9366/Dropset_2_Trainer_Orange_IE8049_01_standard.jpg", "Men", "Sports", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "RS-Fast",
                "The Puma RS-Fast is a futuristic sneaker with leather and mesh upper, IMEVA midsole for cushioning, and rubber outsole for traction and durability.",
                4500.00, 5400.00, "https://assets.ajio.com/medias/sys_master/root/20220705/In0l/62c33f89f997dd03e2b7f223/-473Wx593H-469147305-white-MODEL.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Go Walk 5",
                "The Skechers Go Walk 5 is a comfortable walking shoe with lightweight and responsive ULTRA GO cushioning, Air-Cooled Goga Mat insole, and machine washable design.",
                4200.00, 5000.00, "https://m.media-amazon.com/images/I/71QZFIVjREL._SX695_.jpg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "D-Formation",
                "The Fila D-Formation is a chunky sneaker with leather and synthetic upper, EVA midsole, and rubber outsole for casual style and comfort.",
                3500.00, 4200.00, "https://www.fila.com/dw/image/v2/AAEJ_PRD/on/demandware.static/-/Sites-FilaUSACatalogID/default/dw2fe6ef5c/images/ProductImages/1CM00489_125_01_e.jpg?sw=1334&sh=2000&sm=fit", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "SK8-Hi MTE",
                "The Vans SK8-Hi MTE is a weatherized high-top skate shoe with Scotchgard-treated suede upper, warm fleece lining, and lug outsole for enhanced traction.",
                4000.00, 4800.00, "https://images.vans.com/is/image/Vans/VN0A5HZY_1KP_HERO?wid=1600&hei=1984&fmt=jpeg&qlt=90&resMode=sharp2&op_usm=0.9,1.7,8,0", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Groveton Leather and Fabric Chukka",
                "The Timberland Groveton Leather and Fabric Chukka is a lightweight sneaker-boot hybrid with leather and Cordura fabric upper, OrthoLite footbed, and durable rubber outsole.",
                5500.00, 6600.00, "https://assets.timberland.eu/images/t_img/f_auto,h_650,w_650/v1701899084/TB0A191I231-HERO/Killington-Chukka-for-Men-in-Yellow.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Lerond BL 2",
                "The Lacoste Lerond BL 2 is a classic sneaker with synthetic upper, OrthoLite insole, and embroidered crocodile logo for casual style and comfort.",
                5000.00, 6000.00, "https://imagena1.lacoste.com/dw/image/v2/AAUP_PRD/on/demandware.static/-/Sites-master/default/dweeeb1b8d/39CMA0017_J18_01.jpg?imwidth=915&impolicy=product", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Tanjun",
                "The Nike Tanjun is a lightweight sneaker with mesh upper, cushioned midsole, and durable rubber outsole for everyday comfort and versatile style.",
                4500.00, 5500.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/1acea229-0668-4885-9b1d-d428a9f7cca0/tanjun-shoes-KbdlvQ.png", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Cloudfoam Advantage",
                "The Adidas Cloudfoam Advantage is a tennis-inspired sneaker with leather upper, Cloudfoam midsole for step-in comfort, and rubber outsole for traction.",
                5000.00, 6000.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/c857ec7b44324d1f9c79a4244b3237e7_9366/Grand_Court_Cloudfoam_Comfort_Shoes_White_ID2947_09_standard.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "574 Unisex Casual Shoes",
                "The New Balance 574 is a classic sneaker with suede and mesh upper, ENCAP midsole for support, and rubber outsole for durability and traction.",
                4500.00, 5400.00, "https://www.superkicks.in/cdn/shop/files/4_542f095c-e5ad-4909-b963-cf7759a73f93.jpg?v=1712144198&width=600", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Zig Kinetica II",
                "The Reebok Zig Kinetica II is a performance running shoe with Zig Energy Shell for responsive cushioning and a breathable mesh upper for comfort.",
                5800.00, 7000.00, "https://img.tatacliq.com/images/i10/437Wx649H/MP000000016894196_437Wx649H_202303172125573.jpeg", "Men", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Basket Classic LFS",
                "The Puma Basket Classic LFS is a retro sneaker with leather upper, padded collar, and rubber outsole for traction and durability.",
                4000.00, 4800.00, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/374923/02/sv01/fnd/KOR/fmt/png/Basket-Classic-XXI-Men's-Sneakers", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Solar Fuse",
                "The Skechers Solar Fuse is a sporty sneaker with mesh fabric upper, Air-Cooled Memory Foam insole, and flexible articulated midsole for comfort and support.",
                4200.00, 5000.00, "https://img.tatacliq.com/images/i10/437Wx649H/MP000000016893489_437Wx649H_202303172051241.jpeg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Old Skool",
                "The Vans Old Skool is a classic skate shoe with suede and canvas upper, padded collar for comfort, and signature rubber waffle outsole for grip and durability.",
                4000.00, 4800.00, "https://m.media-amazon.com/images/I/71cebu0z8kL._SY695_.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Davis Square",
                "The Timberland Davis Square is a sneaker-boot hybrid with mesh and leather upper, OrthoLite footbed, and durable rubber outsole for all-day comfort.",
                5500.00, 6600.00, "https://assets.timberland.eu/images/t_img/f_auto,h_650,w_650/v1701899084/TB0A191I231-HERO/Killington-Chukka-for-Men-in-Yellow.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GEL-Quantum 90",
                "The Asics GEL-Quantum 90 is a sporty sneaker with GEL technology for cushioning and a breathable mesh upper for all-day comfort and support.",
                4700.00, 5600.00, "https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcRrSllxmglSTOK85aukGXrcL6JjhGRCQzeEkjNQz1WxTiSyrbqxCiphuTdAOTDaa1sSKj3cljuaFucXrSgrmvU-81QGUNyP0n2tXLNT6dbMtEVUGJPc45smJkg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "Sideline",
                "The Lacoste Sideline is a classic sneaker with canvas upper, OrthoLite insole, and embroidered crocodile logo for a timeless look and comfort.",
                4500.00, 5400.00, "https://imagena1.lacoste.com/dw/image/v2/AAUP_PRD/on/demandware.static/-/Sites-master/default/dweeeb1b8d/39CMA0017_J18_01.jpg?imwidth=915&impolicy=product", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Revolution 6",
                "The Nike Revolution 6 is a lightweight running shoe with mesh upper, cushioned midsole, and durable rubber outsole for everyday comfort and support.",
                3500.00, 4200.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/8abb07a8a14546868cce3ba6e4003cf5_9366/LightRun_Edge_Force_Blue_IU6464_06_standard.jpg", "Men", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Grand Court",
                "The Adidas Grand Court is a tennis-inspired sneaker with synthetic leather upper, Cloudfoam midsole for comfort, and rubber outsole for traction and durability.",
                4500.00, 5400.00, "https://img.tatacliq.com/images/i15//437Wx649H/MP000000020829425_437Wx649H_202401191339113.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "FuelCell Rebel",
                "The New Balance FuelCell Rebel is a performance running shoe with FuelCell foam midsole for explosive energy return and a lightweight engineered mesh upper.",
                9000.00, 10800.00, "https://img.tatacliq.com/images/i16//437Wx649H/MP000000021639132_437Wx649H_202403212148392.jpeg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Club C 85",
                "The Reebok Club C 85 is a classic tennis-inspired sneaker with soft leather upper, terry lining for comfort, and durable rubber outsole for traction and grip.",
                4600.00, 5500.00, "https://www.superkicks.in/cdn/shop/files/1_9d9cf7cb-1254-48c8-a8a8-0a20088a1631.jpg?v=1708940688&width=600", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Ralph Sampson Lo",
                "The Puma Ralph Sampson Lo is a classic basketball-inspired sneaker with leather upper, perforated detailing, and rubber outsole for grip and durability.",
                4500.00, 5400.00, "https://img.tatacliq.com/images/i10/437Wx649H/MP000000016764387_437Wx649H_202303052132222.jpeg", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Ultra Flex 2.0",
                "The Skechers Ultra Flex 2.0 is a sporty sneaker with athletic woven mesh fabric upper, Air-Cooled Memory Foam insole, and highly flexible articulated midsole.",
                4200.00, 5000.00, "https://media-uk.landmarkshops.in/cdn-cgi/image/h=1125,w=1125,q=85,fit=cover/lifestyle/1000010087490-Green-1000010087490_01-2100.jpg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Cress",
                "The Fila Cress is a retro sneaker with leather and synthetic upper, EVA midsole, and durable rubber outsole for casual style and comfort.",
                3500.00, 4200.00, "https://surtidoradepartamental.vteximg.com.br/arquivos/ids/510525-635-635/180000106187_1.jpg?v=638355482392900000", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Vans", "Authentic Platform 2.0",
                "The Vans Authentic Platform 2.0 is a classic skate shoe with canvas upper, platform outsole, and signature rubber waffle outsole for grip and durability.",
                4000.00, 4800.00, "https://8f08a8.cdn.akinoncloud.com/products/2023/04/04/921244/4fb08933-7f63-424f-aeb5-f6bc1fd16d8b_size2010x2010_cropCenter.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Timberland", "Groveton Moc Toe Chukka",
                "The Timberland Groveton Moc Toe Chukka is a rugged and stylish boot with leather and Cordura fabric upper, OrthoLite footbed, and durable rubber outsole.",
                6500.00, 7800.00, "https://assets.timberland.eu/images/t_img/f_auto,h_650,w_650/v1701899084/TB0A191I231-HERO/Killington-Chukka-for-Men-in-Yellow.png", "Men", "Outdoor", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "Metaracer",
                "The Asics Metaracer is a premium racing shoe with Guidesole technology for energy saving and FlyteFoam technology for a lightweight and responsive ride.",
                11000.00, 13200.00, "https://m.media-amazon.com/images/I/81qyQgawsnL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Lacoste", "T-Clip",
                "The Lacoste T-Clip is a tennis-inspired sneaker with synthetic upper, OrthoLite insole, and embroidered crocodile logo for comfort and a timeless look.",
                6000.00, 7200.00, "https://img.tatacliq.com/images/i14/437Wx649H/MP000000020223164_437Wx649H_202311241532301.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "MD Valiant",
                "The Nike MD Valiant is a running-inspired sneaker with suede and synthetic upper, cushioned midsole, and rubber outsole for all-day comfort and support.",
                5500.00, 6600.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/3227af2c-2e1b-4fc0-aa56-b6fd8fbd64da/md-valiant-older-shoe-9b4q3K.png", "Men", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Adidas", "Nizza",
                "The Adidas Nizza is a casual sneaker with canvas upper, rubber toe bumper, and vulcanized rubber outsole for grip and durability.",
                4500.00, 5400.00, "https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/4cee7373f2e34aa6b385aa2c013ee8e9_9366/Nizza_RF_Shoes_White_EF1883_06_standard.jpg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "New Balance", "Hierro v6",
                "The New Balance Hierro v6 is a trail running shoe with Fresh Foam X midsole for a plush ride and a durable Vibram MegaGrip outsole for traction on challenging terrain.",
                12000.00, 14500.00, "https://www.tradeinn.com/f/13812/138122902/new-balance-fresh-foam-hierro-v6-trail-running-shoes.jpg", "Unisex", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Classics Royal Complete Clean LX",
                "The Reebok Classics Royal Complete Clean LX is a retro-inspired sneaker with leather upper, EVA midsole, and rubber outsole for comfort and traction.",
                5000.00, 6000.00, "https://img.tatacliq.com/images/i16//437Wx649H/MP000000021492216_437Wx649H_202403082115245.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Puma", "Future Rider",
                "The Puma Future Rider is a sporty sneaker with mesh and synthetic upper, Rider Foam midsole, and durable rubber outsole for comfort and traction.",
                4800.00, 5800.00, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa,w_900,h_900/global/380591/07/sv01/fnd/IND/fmt/png/Future-Rider-Twofold-Unisex-Sneakers", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "GOwalk 6",
                "The Skechers GOwalk 6 is a comfortable walking shoe with lightweight ULTRA GO cushioning, Air-Cooled Goga Mat insole, and breathable engineered mesh upper.",
                4500.00, 5500.00, "https://img.tatacliq.com/images/i10/437Wx649H/MP000000016943128_437Wx649H_202303220256192.jpeg", "Women", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Ray Tracer",
                "The Fila Ray Tracer is a retro sneaker with leather and synthetic upper, EVA midsole, and chunky rubber outsole for casual style and comfort.",
                3700.00, 4400.00, "https://img.tatacliq.com/images/i17//437Wx649H/MP000000021691695_437Wx649H_202403241626021.jpeg", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Asics", "GEL-Cumulus 23",
                "The Asics GEL-Cumulus 23 is a cushioned running shoe with GEL technology for shock absorption and FlyteFoam midsole for a responsive and smooth ride.",
                8000.00, 9600.00, "https://m.media-amazon.com/images/I/81qyQgawsnL._SY695_.jpg", "Women", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Run All Day 2",
                "The Nike Run All Day 2 is an entry-level running shoe with mesh upper, cushioned midsole, and durable rubber outsole for comfort and support during everyday runs.",
                4200.00, 5100.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/7cbb1c41-c4de-46a8-9f23-cb0a4a059af9/run-all-day-2-running-shoe-rLCk13.png", "Men", "Running", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Reebok", "Classic Leather Legacy",
                "The Reebok Classic Leather Legacy is a retro-inspired sneaker with leather upper, EVA midsole, and rubber outsole for comfort and traction.",
                5800.00, 7000.00, "https://www.superkicks.in/cdn/shop/products/1_94d92ea3-9e46-4904-aebe-37f395191a8f.jpg?v=1680270057&width=600", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Skechers", "Relaxed Fit: D'Lux Walker",
                "The Skechers Relaxed Fit: D'Lux Walker is a comfortable walking shoe with smooth leather upper, Air-Cooled Memory Foam insole, and flexible rubber outsole.",
                4200.00, 5000.00, "https://img.tatacliq.com/images/i18//437Wx649H/MP000000022460748_437Wx649H_202406012118141.jpeg", "Women", "Casual", "NEW_ARRIVALS", "NO_TAG"
            ),
            ItemListing(
                "Fila", "Machu 2",
                "The Fila Machu 2 is a retro sneaker with leather and synthetic upper, EVA midsole, and durable rubber outsole for comfort and casual style.",
                3500.00, 4200.00, "https://sportpalace.com.mx/cdn/shop/files/22125114_114_1_2x_66117e6a-1174-4d0e-8d2f-609b62c74516@2x.jpg?v=1700150658", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ),
            ItemListing(
                "Nike", "Air Max 90",
                "The Nike Air Max 90 is an iconic sneaker with leather and synthetic upper, visible Air Max unit in the heel for cushioning, and rubber outsole for traction and durability.",
                8500.00, 10200.00, "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/0b2553d3-6d28-46d6-9b7c-408e8a2cb006/air-max-90-shoes-98F148.png", "Unisex", "Casual", "NO_CAT", "NO_TAG"
            ), )
    }

    fun getBanners(): List<Banner> {
        return listOf(
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/banner_2.jpg?alt=media&token=d57a1821-56d6-4a04-bacb-9eef77ed8db0"),
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/sale.jpg?alt=media&token=7ffd4525-5f02-4c24-ab75-403c54047609"),
            Banner("https://firebasestorage.googleapis.com/v0/b/urbnkicks-325ea.appspot.com/o/newbalance2.jpg?alt=media&token=52e11ddc-7132-4af1-a6f7-8bd7a775b2ce"),
        )
    }
}